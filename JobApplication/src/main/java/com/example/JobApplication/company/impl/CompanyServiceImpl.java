package com.example.JobApplication.company.impl;

import com.example.JobApplication.company.Company;
import com.example.JobApplication.company.CompanyRepository;
import com.example.JobApplication.company.CompanyService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompany(Company updatedcompany, Long id) {
        Optional<Company> companyOptional = companyRepository.findById(id);
        if(companyOptional.isPresent()){
            Company company = companyOptional.get();
            company.setDescription(updatedcompany.getDescription());
            company.setName(updatedcompany.getName());
            company.setJobs(updatedcompany.getJobs());
            companyRepository.save(company);
            return true;
        }
        return false;
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }


}
