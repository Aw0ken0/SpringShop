package ru.gb.shop.inventory.UserEntity;

import lombok.Data;


import javax.persistence.*;

@Table(name = "ROLES")
@Entity
@Data
public class Role {
    @Id
    private long id;
    @Column(name = "role",unique = true,nullable = false)
    private String role;

}
