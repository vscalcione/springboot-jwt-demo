package it.vscalcione.springboot.jwtapplication.service;

import it.vscalcione.springboot.jwtapplication.domain.RandomCity;
import it.vscalcione.springboot.jwtapplication.domain.User;

import java.util.List;

public interface GenericService {
    User findByUsername(String username);
    List<User> findAllUsers();
    List<RandomCity> findAllRandomCities();
}
