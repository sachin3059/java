package com.example.JobApplication.job.impl;


import com.example.JobApplication.job.Job;
import com.example.JobApplication.job.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class JobServiceImpl implements JobService {

    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Job> findAll(){
        return jobs;
    }

    @Override
    public void createJob(Job job){
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job findJobById(Long id){
        for(var job : jobs){
            if(Objects.equals(job.getId(), id)){
                return job;
            }
        }
        return null;
    }

    @Override
    public boolean deleteJobById(Long id){
        List<Job> updatedJobs = new ArrayList<>();
        boolean ok = false;
        for(var job : jobs){
            if(job.getId().equals(id)){
                ok = true;
                continue;
            }
            else {
                updatedJobs.add(job);
            }
        }
        jobs = updatedJobs;
        return ok;
    }


    @Override
    public boolean updateJobById(Long id, Job updatedJob){
        for(int i = 0; i < jobs.size(); i++){
            if(jobs.get(i).getId().equals(id)){
                jobs.set(i, updatedJob);
                return  true;
            }
        }
        return false;
    }

}
