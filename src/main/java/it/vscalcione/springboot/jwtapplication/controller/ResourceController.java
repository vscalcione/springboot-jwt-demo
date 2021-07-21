package it.vscalcione.springboot.jwtapplication.controller;

import it.vscalcione.springboot.jwtapplication.domain.RandomCity;
import it.vscalcione.springboot.jwtapplication.domain.User;
import it.vscalcione.springboot.jwtapplication.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/springbootjwt")
public class ResourceController {

    @Autowired
    private GenericService userGenericService;

    @RequestMapping(value = "/cities")
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<RandomCity> getUser() {
        return userGenericService.findAllRandomCities();
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers() {
        return userGenericService.findAllUsers();
    }
}
