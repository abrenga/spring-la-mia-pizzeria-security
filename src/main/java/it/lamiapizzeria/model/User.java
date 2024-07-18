package it.lamiapizzeria.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

@Entity
@Table
public class User {
 @Id
 private Integer id;
 @NotBlank
 private String username;

 @NotBlank
 private String password;
 @ManyToMany(fetch = FetchType.EAGER)
 private Set<Role> roles;

 public Integer getId() {
  return id;
 }
 public void setId(Integer id) {
  this.id = id;
 }
 public String getUsername() {
  return username;
 }
 public void setUsername(String username) {
  this.username = username;
 }
 public String getPassword() {
  return password;
 }
 public void setPassword(String password) {
  this.password = password;
 }
 public Set<Role> getRoles() {
  return roles;
 }
 public void setRoles(Set<Role> roles) {
  this.roles = roles;
 }

}

