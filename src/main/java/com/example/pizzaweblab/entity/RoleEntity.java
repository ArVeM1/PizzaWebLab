package com.example.pizzaweblab.entity;

import javax.persistence.*;

@Entity
@Table(name="Role")
public class RoleEntity {
    @Id
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
