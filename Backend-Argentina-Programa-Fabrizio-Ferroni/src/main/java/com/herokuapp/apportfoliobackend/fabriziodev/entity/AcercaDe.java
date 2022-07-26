package com.herokuapp.apportfoliobackend.fabriziodev.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class AcercaDe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name="titulo", nullable=false)
    private String titulo;

    @NotNull
    @Column(name="descripcion", nullable=false, length=2048)
    private String descripcion;

    @NotNull
    @Column(name="email", nullable=false)
    private String email;
    @Column(nullable = false)
    @NotNull
    private String imagenName;
    @Column(nullable = false)
    @NotNull
    private String imagenUrl;
    @Column(nullable = false)
    @NotNull
    private Integer usuario_id;
    @Column(nullable = false)
    @NotNull
    private LocalDateTime createdAt;

    private LocalDateTime editedAt;

    public AcercaDe() {
    }

    public AcercaDe(int id, String titulo, String descripcion, String email, String imagenName, String imagenUrl, Integer usuario_id, LocalDateTime createdAt, LocalDateTime editedAt) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.email = email;
        this.imagenName = imagenName;
        this.imagenUrl = imagenUrl;
        this.usuario_id = usuario_id;
        this.createdAt = createdAt;
        this.editedAt = editedAt;
    }
}