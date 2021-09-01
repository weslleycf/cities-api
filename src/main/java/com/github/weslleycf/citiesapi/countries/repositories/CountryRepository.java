package com.github.weslleycf.citiesapi.countries.repositories;

import com.github.weslleycf.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
