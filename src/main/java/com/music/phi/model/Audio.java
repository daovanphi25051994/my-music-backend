package com.music.phi.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Audio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String audioName;

    @Lob
    private byte[] data;
}
