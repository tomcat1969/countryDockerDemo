package com.example.countrydemo2.form;

import com.example.countrydemo2.model.Country;
import org.springframework.beans.BeanUtils;

public class CountryFormConvert implements FormConvert<CountryForm, Country> {

    @Override
    public Country convert(CountryForm countryForm) {
        Country country = new Country();
        BeanUtils.copyProperties(countryForm,country);

        return country;
    }
}
