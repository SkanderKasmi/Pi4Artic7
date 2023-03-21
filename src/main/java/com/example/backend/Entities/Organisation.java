package com.example.backend.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    double idOrg;
    String nameOrg;
    String DescOrg;
    String photoOrg;
    @ManyToMany
    List<UserOrgType>userOrgTypess;

}
