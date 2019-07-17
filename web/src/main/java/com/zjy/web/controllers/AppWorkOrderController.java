package com.zjy.web.controllers;

import com.zjy.AppWorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 */
@RestController
@RequestMapping("appWorkOrder")
public class AppWorkOrderController extends WorkOrderBaseController {

    @Autowired
    protected AppWorkOrderService appWorkOrderService;

    public String test() {
        return workOrderBaseService.myBaseMethod();
    }
}
