package com.zjy;

import com.zjy.enums.WorkOrderType;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * TODO
 */
@Service
@Primary
public class WorkOrderBaseServiceImpl implements WorkOrderBaseService {

    protected WorkOrderType workOrderType = WorkOrderType.DEFAULT;

    public WorkOrderType getWorkOrderType() {
        return workOrderType;
    }

    @Override
    public String myBaseMethod() {
        System.out.println(workOrderType.getName());
        return workOrderType.toString();
    }
}
