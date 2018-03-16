package com.example.demo.web;

import com.example.demo.model.DemoModel;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/demo" , method = RequestMethod.GET)
    public String showDemos(ModelMap map){
        List<DemoModel> demoModelList = demoService.getAllActiveDemoModelList();
        map.addAttribute("demoList",demoModelList);
        return "demo";

    }

    @RequestMapping(value = "/demo/{id}" , method = RequestMethod.GET)
    public String finDemo(@PathVariable("id") int id,ModelMap map){
        DemoModel demoModel = demoService.getActiveDemoModel(id);
        if(demoModel==null){
            map.addAttribute("message","demo not found");
        }else{
            demoModel.setActive(false);
        }
        map.addAttribute("demo",demoModel);
        return "demo";

    }
}
