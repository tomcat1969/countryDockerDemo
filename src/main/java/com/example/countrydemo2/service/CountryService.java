package com.example.countrydemo2.service;

import com.example.countrydemo2.model.Country;
import com.example.countrydemo2.repo.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public List<Country> getCountryList() {
        return countryRepository.findAll();
    }

    public void delete(int id) {
        countryRepository.deleteById(id);
    }

    public Country get(int id) {
        return countryRepository.findById(id).get();
    }

    public void saveCountry(Country c) {
        countryRepository.save(c);
    }



}
