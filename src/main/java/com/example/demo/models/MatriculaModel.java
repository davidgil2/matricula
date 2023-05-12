package com.example.demo.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "matricula")
public class MatriculaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "EstudianteId")
    private EstudianteModel estudiante;
    @Column(name = "Semestre")
    private String semestre;

    @ManyToMany
    @JoinTable(name = "grupomatricula", joinColumns = {
            @JoinColumn(name = "MatriculasId", referencedColumnName = "id") }, inverseJoinColumns = {
                    @JoinColumn(name = "GruposId", referencedColumnName = "id") })
    private List<GrupoModel> grupos;
}
