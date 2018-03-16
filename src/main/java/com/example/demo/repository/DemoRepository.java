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

        this.demoModelList = new ArrayList<>();
        demoModelList.add(demoModel);
        demoModelList.add(demoModel1);
        demoModelList.add(demoModel2);
        demoModelList.add(demoModel3);
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
