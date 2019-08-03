package com.zjy.web.controllers;

import com.zjy.AppWorkOrderService;
import com.zjy.enums.WorkOrderType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * TODO
 */
@RestController
@RequestMapping("appWorkOrder")
public class AppWorkOrderController extends WorkOrderBaseController {

    @Autowired
    private AppWorkOrderService appWorkOrderService;

    @PostConstruct
    public void AppWorkOrderController() {
        this.workOrderService = appWorkOrderService;
        this.workOrderType = WorkOrderType.APP;
    }
}
