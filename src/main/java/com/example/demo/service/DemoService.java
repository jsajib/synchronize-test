package com.example.demo.service;

import com.example.demo.model.DemoModel;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public synchronized DemoModel getActiveDemoModel(int id) {
        DemoModel demoModel = demoRepository.getActiveDemo(id);
        return demoModel;
    }

    public List<DemoModel> getAllActiveDemoModelList() {
        return demoRepository.getAllActiveDemoModelList();
    }


}
