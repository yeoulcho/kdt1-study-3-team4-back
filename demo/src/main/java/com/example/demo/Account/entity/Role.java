package com.example.demo.Account.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roleType")
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }

    public RoleType getRoleType() {
        return roleType;
    }
}
