package com.example.pescadito.model;

import jakarta.persistence.*;

@Entity
@Table(name = "combinado")
public class Combinado{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private Double precio;

    @Column(nullable = false)
    private Boolean disponible;

    @Column(nullable = false)
    private String categoria;

    public Combinado(){
    }
    public Combinado (Integer id, String nombre, String descripcion, Double precio,
                      Boolean disponible, String categoria )
    {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public java.lang.String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }

    public java.lang.Double getPrecio() {
        return precio;
    }

    public void setPrecio(java.lang.Double precio) {
        this.precio = precio;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public java.lang.String getCategoria() {
        return categoria;
    }

    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }
}
