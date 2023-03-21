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
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idComment;
    String textComment;
    Date dateComment;
    @ManyToOne
    User user;
    @OneToMany(mappedBy = "commentaire")
    List<Reaction>reactions;


}
