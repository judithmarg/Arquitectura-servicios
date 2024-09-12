package com.ucb.FrankyService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkflowService {
    List<Workflow> list = new ArrayList<>();

    public List obtainList() {
        return this.list;
    }

    public void create(Workflow workflow) {
        list.add(workflow);
    }

    public int findIndex(String name) {
        int indexFounded = -1;
        for(int index = 0; index < list.size(); index++) {
            if(list.get(index).name().equals(name)){
                indexFounded = index;
            }
        }
        return indexFounded;
    }

    public boolean delete(String nameWorkflow) {
        int lastLength = list.size();
        int index = findIndex(nameWorkflow);
        list.remove(index);
        return lastLength != list.size();
    }

    public void update(String name, Workflow newWorkflow) {
        int index = findIndex(name);
        list.set(index, newWorkflow);
    }
}
