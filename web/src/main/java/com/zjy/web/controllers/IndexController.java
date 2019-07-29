package com.zjy.web.controllers;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjy.daos.TestTableDao;
import com.zjy.dto.TestTableDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "IndexController|一个用来测试swagger注解的控制器")
public class IndexController {

    @Autowired
    private TestTableDao testTableDao;

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("index")
    public String index() {
        Object aa = applicationContext.getBean("aa");
        Object bb = applicationContext.getBean("bb");
        System.out.println("访问程序成功");
        PageHelper.startPage(1, 10);
        List<TestTableDto> all = testTableDao.getAll();
        PageInfo<TestTableDto> testTableDtos = new PageInfo<>(all);
        return "OK";
    }

    @GetMapping("test")
    @ApiOperation(value="测试参数", notes="id为int")
    @ApiImplicitParam(paramType="query", name = "id", value = "用户id", required = true, dataType = "Integer")
    public String test(int id) {
        return "test" + id;
    }
}
