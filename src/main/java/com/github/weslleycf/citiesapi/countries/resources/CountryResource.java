package com.github.weslleycf.citiesapi.countries.resources;


import com.github.weslleycf.citiesapi.
import com.github.weslleycf.citiesapi.countries.entities.Country;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @GetMapping
    public List<Country> countries(){

    }


}
