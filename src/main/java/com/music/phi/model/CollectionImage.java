package com.music.phi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class CollectionImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    private User user;
}
