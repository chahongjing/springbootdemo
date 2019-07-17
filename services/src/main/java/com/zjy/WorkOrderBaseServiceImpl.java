package com.zjy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * TODO
 */
@Service
@Primary
public class WorkOrderBaseServiceImpl implements WorkOrderBaseService {
    @Override
    public String myBaseMethod() {
        String a = "base";
        System.out.println(a);
        return a;
    }
}
