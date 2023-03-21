package com.example.backend.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@ToString

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Reaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idReact;
    TypeReact typeReact;
    @ManyToOne
    Post post;
    @ManyToOne
    User user;
    @ManyToOne
    Commentaire commentaire;

}
