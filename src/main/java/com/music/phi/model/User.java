package com.music.phi.model;

import lombok.Data;

import javax.persistence.*;
import java.awt.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @OneToOne
    private Image avatar;
}
