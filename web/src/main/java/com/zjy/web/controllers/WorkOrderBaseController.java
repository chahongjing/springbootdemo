package com.zjy.web.controllers;

import com.zjy.WorkOrderBaseService;
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

    @Autowired
    protected WorkOrderBaseService workOrderBaseService;

    @GetMapping("test")
    public String test() {
        return workOrderBaseService.myBaseMethod();
    }
}
