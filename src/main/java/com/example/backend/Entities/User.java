package com.example.backend.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int  IdUser;
     String emailU;
     String firstnameU;
     String lastnameU;
     int phoneU;
     Gender gender;
     Date BirthDate;
     String photoU;
     String passwordU;
     @ManyToMany
     List<UserOrgType>userOrgTypes;
     @OneToMany(mappedBy = "user")
     List<Commentaire>commentaires;
     @OneToMany(mappedBy = "user")
     List<Reaction>reactions;




}
