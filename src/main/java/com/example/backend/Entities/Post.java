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
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int IdPostes;
    String TitleP;
    String DescriptionP;
    Date datepostes;
    @ManyToOne
    UserOrgType userOrgType;
    TypePost typePost;
    @OneToMany(mappedBy = "post")
    List<Reaction>reactions;


}
