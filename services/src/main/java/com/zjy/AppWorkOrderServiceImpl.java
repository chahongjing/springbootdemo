package com.zjy;

import com.zjy.enums.WorkOrderType;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * TODO
 */
@Service
public class AppWorkOrderServiceImpl extends WorkOrderBaseServiceImpl implements AppWorkOrderService {

    @PostConstruct
    public void AfterSaleWorkOrderController() {
        this.workOrderType = WorkOrderType.APP;
    }
}
