package com.example.service;

import com.example.bean.Employee;
import com.example.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能:
 *
 * @author zhi
 * @version 1.0
 * @date 2020-04-23 12:47
 **/
@Service("employeeService")
public class EmployeeService {
    private EmployeeMapper employeeMapper;
    @Autowired
    public EmployeeService(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public List<Employee> getEmps(){
        return employeeMapper.selectAll();
    }
}
