package it.vscalcione.springboot.jwtapplication.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "app_role")
@Getter
@Setter
public class Role implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "description")
    private String description;
}
