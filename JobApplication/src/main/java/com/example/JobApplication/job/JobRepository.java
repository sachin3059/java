package com.example.JobApplication.job;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {              // JpaRepository< Entity, PrimaryKey>

}
