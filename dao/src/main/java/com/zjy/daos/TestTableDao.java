package com.zjy.daos;


import com.zjy.dto.TestTableDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestTableDao {
    List<TestTableDto> getAll();
}
