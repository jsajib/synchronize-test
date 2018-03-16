package com.example.demo.repository;

import com.example.demo.model.DemoModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class DemoRepository {

    private List<DemoModel> demoModelList;

    public DemoRepository() {
        DemoModel demoModel = new DemoModel(1, "shajib", 100, true);
        DemoModel demoModel1 = new DemoModel(2, "test1", 100, true);
        DemoModel demoModel2 = new DemoModel(3, "test2", 100, false);
        DemoModel demoModel3 = new DemoModel(4, "test3", 100, true);
        DemoModel demoModel4 = new DemoModel(5, "test4", 100, true);
        DemoModel demoModel5 = new DemoModel(6, "test5", 100, true);
        DemoModel demoModel6 = new DemoModel(7, "test6", 100, true);
        DemoModel demoModel7 = new DemoModel(8, "test7", 100, true);
        DemoModel demoModel8= new DemoModel(9, "shajib8", 100, true);
        DemoModel demoModel9 = new DemoModel(10, "test19", 100, true);
        DemoModel demoModel10 = new DemoModel(11, "test10", 100, true);
        DemoModel demoModel11 = new DemoModel(12, "test11", 100, true);
        DemoModel demoModel12 = new DemoModel(13, "shajib2", 100, true);
        DemoModel demoModel13 = new DemoModel(14, "test13", 100, true);
        DemoModel demoModel14 = new DemoModel(15, "test15", 100, true);
        DemoModel demoModel15 = new DemoModel(16, "test14", 100, true);

        this.demoModelList = new ArrayList<>();
        demoModelList.add(demoModel);
        demoModelList.add(demoModel1);
        demoModelList.add(demoModel2);
        demoModelList.add(demoModel3);
        demoModelList.add(demoModel4);
        demoModelList.add(demoModel5);
        demoModelList.add(demoModel6);
        demoModelList.add(demoModel7);
        demoModelList.add(demoModel8);
        demoModelList.add(demoModel9);
        demoModelList.add(demoModel10);
        demoModelList.add(demoModel11);
        demoModelList.add(demoModel12);
        demoModelList.add(demoModel13);
        demoModelList.add(demoModel14);
        demoModelList.add(demoModel15);
    }

    public DemoModel getActiveDemo(int id) {
        Optional<DemoModel> demoModel = demoModelList.stream().filter(demo -> demo.isActive() == true && demo.getId() == id).findAny();
        if (demoModel.isPresent()) {
            return demoModel.get();
        } else {
            return null;
        }
    }

    public List<DemoModel> getAllActiveDemoModelList() {
        return demoModelList.stream().filter(demo -> demo.isActive() == true).collect(Collectors.toList());
    }

}
