package com.gameofthrones.service.handlers;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.springframework.stereotype.Component;

import com.gameofthrones.model.*;

@Component("MyRentalSearchTask")
public class MySearchWorkItemHandler implements WorkItemHandler{

	@Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        System.out.println("Work item my search task being executed " + workItem);
        UserAnsSearch param = (UserAnsSearch) workItem.getParameter("userAnsHolder");
        
        Map<String, Object> results = new HashMap<String, Object>();
        results.put("Result", param);
        
        manager.completeWorkItem(workItem.getId(), results);
        
        System.out.println("Work item result2 is  " + workItem.getResult("Result"));

    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {

    }
    
}
