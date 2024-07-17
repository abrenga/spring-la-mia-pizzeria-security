package it.lamiapizzeria.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import jakarta.validation.constraints.NotBlank;

@Entity
public class User {
 @Id
 private Integer id;
 @NotBlank
 private String username;

 @NotBlank
 private String password;
 @ManyToMany(fetch = FetchType.EAGER)
 private Set<Role> roles;
}

