package com.example.JobApplication.company;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    // nothing to do here for crud operation.
}
