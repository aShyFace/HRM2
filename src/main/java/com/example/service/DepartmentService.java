package com.example.service;

import com.example.bean.Department;
import com.example.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能:
 * @author zhi
 * @version 1.0
 * @date 2020-04-23 12:46
 **/
@Service("departmentService")
public class DepartmentService {
    private DepartmentMapper departmentMapper;
    @Autowired
    public DepartmentService(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    public List<Department> getDepts(){
        return departmentMapper.selectAll();
    }
}
