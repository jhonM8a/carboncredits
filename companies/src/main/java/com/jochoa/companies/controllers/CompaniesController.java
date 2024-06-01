package com.jochoa.companies.controllers;

import com.jochoa.companies.dao.CompaniesDAO;
import com.jochoa.companies.models.Company;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
}
