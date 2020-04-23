package com.example.dao;

import com.example.bean.Job;
import java.util.List;

public interface JobMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    Job selectByPrimaryKey(Integer id);

    List<Job> selectAll();

    int updateByPrimaryKey(Job record);
}