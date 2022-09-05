package com.example.Eje.sesion456.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "laps")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //atributos
    private Long id;
    private String marca;
    private String modelo;
    private LocalDate fechaLan;
    private Double precio;
    private Boolean existencia;

    //constructores

    public Laptop() {}

    public Laptop(Long id, String marca, String modelo, LocalDate fechaLan, Double precio, Boolean existencia) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaLan = fechaLan;
        this.precio = precio;
        this.existencia = existencia;
    }

    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFechaLan() {
        return fechaLan;
    }

    public void setFechaLan(LocalDate fechaLan) {
        this.fechaLan = fechaLan;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getExistencia() {
        return existencia;
    }

    public void setExistencia(Boolean existencia) {
        this.existencia = existencia;
    }


    //toString

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaLan=" + fechaLan +
                ", precio=" + precio +
                ", existencia=" + existencia +
                '}';
    }
}
