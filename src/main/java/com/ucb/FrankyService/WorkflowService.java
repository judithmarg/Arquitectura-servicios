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
        String nameFormated = name.trim().toLowerCase();
        int indexFounded = -1;
        for(int index = 0; index < list.size(); index++) {
            String nameToCompare = list.get(index).name().trim().toLowerCase();
            if(nameToCompare.equals(nameFormated)){
                indexFounded = index;
            }
        }
        return indexFounded;
    }

    public boolean delete(String nameWorkflow) {
        try {
            int lastLength = list.size();
            int index = findIndex(nameWorkflow);
            list.remove(index);
            return lastLength != list.size();
        }catch(Exception e) {
            return false;
        }
    }

    public boolean update(String name, Workflow newWorkflow) {
        int index = findIndex(name);

        if(index == -1) {
            return false;
        }
        String lastName = list.get(index).name();
        String lastDescription = list.get(index).description();
        list.set(index, newWorkflow);
        return !(list.get(index).description().equals(lastDescription)
                || list.get(index).name().equals(lastName));
    }
}
