package com.zjy.web.controllers;

import com.zjy.AfterSaleWorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 */
@RestController
@RequestMapping("afterSaleWorkOrder")
public class AfterSaleWorkOrderController extends WorkOrderBaseController {

    @Autowired
    protected AfterSaleWorkOrderService afterSaleWorkOrderService;
}