package it.vscalcione.springboot.jwtapplication.repository;

import it.vscalcione.springboot.jwtapplication.domain.RandomCity;
import org.springframework.data.repository.CrudRepository;

public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
