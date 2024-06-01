package com.jochoa.companies.controllers;

import com.jochoa.companies.dao.CompaniesDAO;
import com.jochoa.companies.models.Company;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompaniesController {
    static CompaniesDAO companies = new CompaniesDAO();

    static {
        companies.addCompany(new Company(1L,"","",""));
    }

    @GetMapping("/companies")
    public List<Company> getCompanies(){
        return companies.getCompanies();
    }
    @PostMapping("/companies")
    public String addCompany(@RequestBody Company company){
        companies.addCompany(company);
        return "ok";
    }
    @GetMapping("/companies/{id}")
    public Optional<Company> getCompany(@PathVariable Long id){
        return companies.getCompanies().stream().filter(company -> company.getId() == id).findFirst();
    }

    @PutMapping("/companies/{id}")
    public String updateCompany(@PathVariable Long id){
        return "ok";
    }

    @DeleteMapping
    public void deleteCompany(@PathVariable Long id){

    }


}
