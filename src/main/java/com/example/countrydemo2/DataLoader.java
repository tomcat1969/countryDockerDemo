//package com.example.countrydemo2;
//
//import com.example.countrydemo2.model.Country;
//import com.example.countrydemo2.repo.CountryRepository;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//
//public class DataLoader {
//    private final CountryRepository countryRepository;
//
//    public DataLoader(CountryRepository countryRepository) {
//        this.countryRepository = countryRepository;
//    }
//
//    @PostConstruct
//    private void loadData() {
//        System.out.println("loading Data.........");
//        countryRepository.saveAll(List.of(
//                new Country(1,"China","BeiJing",1439),
//                new  Country(2,"India","New Delhi",1380),
//                new Country(3,"United States","Washington DC",331),
//                new Country(4,"Japan","Tokyo",133)
//        ));
//    }
//}
