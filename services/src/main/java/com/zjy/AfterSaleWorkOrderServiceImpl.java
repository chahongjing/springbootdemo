package com.zjy;

import org.springframework.stereotype.Service;

/**
 * TODO
 */
@Service
public class AfterSaleWorkOrderServiceImpl extends WorkOrderBaseServiceImpl implements AfterSaleWorkOrderService {

    @Override
    public String myBaseMethod() {
        String a = "aftersale";
        System.out.println(a);
        return a;
    }
}
