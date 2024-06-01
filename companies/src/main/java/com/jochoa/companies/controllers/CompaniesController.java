package com.jochoa.companies.controllers;

import com.jochoa.companies.dao.CompaniesDAO;
import com.jochoa.companies.models.Company;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CompaniesController {
    CompaniesDAO companies;

    @GetMapping("/companies")
    public List<Company> getCompanies(){
        return companies.getCompanies();
    }
}
