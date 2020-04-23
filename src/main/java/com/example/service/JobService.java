package com.example.service;

import com.example.bean.Job;
import com.example.dao.JobMapper;
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
@Service("jobService")
public class JobService {
    private JobMapper jobMapper;
    @Autowired
    public JobService(JobMapper jobMapper) {
        this.jobMapper = jobMapper;
    }

    public List<Job> getJobs(){
        return jobMapper.selectAll();
    }
}
