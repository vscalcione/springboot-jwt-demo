package it.vscalcione.springboot.jwtapplication.repository;

import it.vscalcione.springboot.jwtapplication.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
