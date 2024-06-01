package com.jochoa.companies.dao;

import com.jochoa.companies.models.Company;

import java.util.ArrayList;

public class CompaniesDAO {
    ArrayList<Company> companies;

    public CompaniesDAO() {
        companies = new ArrayList();
    }

    public void addCompany(Company company){
        this.companies.add(company);
    }

    public ArrayList<Company> getCompanies(){
        return companies;
    }
}
