package com.github.weslleycf.citiesapi.states.repositories;


import com.github.weslleycf.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}