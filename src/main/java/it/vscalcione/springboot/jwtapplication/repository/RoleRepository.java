package it.vscalcione.springboot.jwtapplication.repository;

import it.vscalcione.springboot.jwtapplication.domain.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
