package com.example.JobApplication.job;

import com.example.JobApplication.company.Company;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class JobContoller {

    private JobService jobService;

    public JobContoller(JobService jobService) {            // for dependency injection. jobcontroller -> depends on jobService
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> findAll(){
        return ResponseEntity.ok(jobService.findAll());
    }

    @PostMapping("/jobs")
    public ResponseEntity<String> createJob(@RequestBody Job job){
        jobService.createJob(job);
        return new ResponseEntity<>("Job added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id){
        Job job =  jobService.findJobById(id);
        if(job != null){
            return new ResponseEntity<>(job, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long id){
        boolean isJobDeleted = jobService.deleteJobById(id);
        if(isJobDeleted){
            return  new ResponseEntity<>("Job deleted successfully", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Job id not found!", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/jobs/{id}")
    public ResponseEntity<String> updateJobById(@PathVariable Long id, @RequestBody Job updatedJob){
        boolean updated = jobService.updateJobById(id, updatedJob);
        if(updated){
            return new ResponseEntity<>("job updated successful!", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("something error", HttpStatus.NOT_FOUND);
        }
    }


}
