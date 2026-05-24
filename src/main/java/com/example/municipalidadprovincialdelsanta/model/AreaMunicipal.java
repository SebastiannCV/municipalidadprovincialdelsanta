package com.example.municipalidadprovincialdelsanta.model;
import jakarta.persistence.*;

@Entity
public class AreaMunicipal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String idArea;

    private String nombreArea;
    private String ubicacion;
    private String responsable;

    // Constructor con parámetros
    public AreaMunicipal(String idArea, String nombreArea,
                         String ubicacion, String responsable) {
        this.idArea = idArea;
        this.nombreArea = nombreArea;
        this.ubicacion = ubicacion;
        this.responsable = responsable;
    }

    // Constructor vacío
    public AreaMunicipal() {}

    // Métodos
    public void asignarTramite() {
        System.out.println("Trámite asignado al área: " + this.nombreArea);
    }

    public void procesarTramite() {
        System.out.println("Procesando trámite en el área: " + this.nombreArea);
    }

    public void generarInforme() {
        System.out.println("Informe generado por el área: " + this.nombreArea);
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getIdArea() { return idArea; }
    public void setIdArea(String idArea) { this.idArea = idArea; }

    public String getNombreArea() { return nombreArea; }
    public void setNombreArea(String nombreArea) { this.nombreArea = nombreArea; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getResponsable() { return responsable; }
    public void setResponsable(String responsable) { this.responsable = responsable; }
}
