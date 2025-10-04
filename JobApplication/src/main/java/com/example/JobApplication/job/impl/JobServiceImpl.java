package com.example.JobApplication.job.impl;


import com.example.JobApplication.job.Job;
import com.example.JobApplication.job.JobRepository;
import com.example.JobApplication.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {

    //private List<Job> jobs = new ArrayList<>();
    JobRepository jobRepository;
    private Long nextId = 1L;

    public JobServiceImpl(JobRepository jobRepository) {                // bean managed by spring.
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> findAll(){
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job){
        jobRepository.save(job);
    }

    @Override
    public Job findJobById(Long id){
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public boolean deleteJobById(Long id){
        try {
            jobRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }


    @Override
    public boolean updateJobById(Long id, Job updatedJob){
        Optional<Job> jobOptional = jobRepository.findById(id);

        if(jobOptional.isPresent()){
            Job job = jobOptional.get();
            job.setTitle(updatedJob.getTitle());
            job.setDescription(updatedJob.getDescription());
            job.setLocation(updatedJob.getLocation());
            job.setMaxSalary(updatedJob.getMaxSalary());
            job.setMinSalary(updatedJob.getMinSalary());

            jobRepository.save(job);
            return true;
        }

        return false;
    }


}
