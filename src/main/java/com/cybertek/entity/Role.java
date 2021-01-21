package com.cybertek.entity;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    private String description;

    @OneToMany(mappedBy = "role",fetch = FetchType.LAZY)
    private List<User> users = new ArrayList<>();
}
