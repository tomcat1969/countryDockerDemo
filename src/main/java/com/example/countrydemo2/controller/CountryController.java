package com.example.countrydemo2.controller;


import com.example.countrydemo2.form.CountryForm;
import com.example.countrydemo2.form.CountryFormConvert;
import com.example.countrydemo2.model.Country;
import com.example.countrydemo2.service.CountryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    CountryService couService;

    @RequestMapping("/")
    public String listCountries(Model model) {
        List<Country> list = couService.getCountryList();
        model.addAttribute("countries",list);
        return "countries";
    }

    @GetMapping("/addNew")
    public String addNewCountry() {
        return "addNew";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable int id, Model model) {
        Country country = couService.get(id);
        model.addAttribute("country",country);
        return "detail_country";
    }

    @GetMapping("/edit/{id}")
    public String editCountry(@PathVariable int id, Model model) {
        Country country = couService.get(id);
        model.addAttribute("country",country);
        return "edit_country";
    }


    @RequestMapping("/delete/{id}")
    public String deleteCountry(@PathVariable(name="id") int id)
    {
        couService.delete(id);
        return "redirect:/countries/";
    }

//    @RequestMapping("/edit/{id}")
//    public ModelAndView showEditCountryPage(@PathVariable(name = "id") int id)
//    {
//        ModelAndView mav = new ModelAndView("detail_country");
//        Country c = couService.get(id);
//
//        mav.addObject("country",c);
//        return mav;
//
//    }
    @PostMapping("/save")
    public String saveCountry( CountryForm countryForm)
    {
        Country country = new CountryFormConvert().convert(countryForm);

        couService.saveCountry(country);
        return "redirect:/countries/";
    }

}
