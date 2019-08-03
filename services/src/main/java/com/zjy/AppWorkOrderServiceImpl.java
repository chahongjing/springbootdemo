package com.zjy;

import org.springframework.stereotype.Service;

/**
 * TODO
 */
@Service
public class AppWorkOrderServiceImpl extends WorkOrderBaseServiceImpl implements AppWorkOrderService {

    @Override
    public String myBaseMethod() {
        String a = "appworkorder";
        System.out.println(a);
        return a;
    }
}
