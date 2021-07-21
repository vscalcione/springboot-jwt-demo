package it.vscalcione.springboot.jwtapplication.service;

import it.vscalcione.springboot.jwtapplication.domain.RandomCity;
import it.vscalcione.springboot.jwtapplication.domain.User;
import it.vscalcione.springboot.jwtapplication.repository.RandomCityRepository;
import it.vscalcione.springboot.jwtapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GenericServiceImpl implements GenericService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return (List<RandomCity>) randomCityRepository.findAll();
    }
}
