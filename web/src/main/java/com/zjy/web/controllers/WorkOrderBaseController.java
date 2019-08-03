package com.zjy.web.controllers;

import com.zjy.WorkOrderBaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 */
@RestController
@RequestMapping("workOrderBase")
public class WorkOrderBaseController {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected WorkOrderBaseService workOrderService;

    @GetMapping("test")
    public String test() {
        logger.info("主要用来进行测试");
        return workOrderService.myBaseMethod();
    }
}
