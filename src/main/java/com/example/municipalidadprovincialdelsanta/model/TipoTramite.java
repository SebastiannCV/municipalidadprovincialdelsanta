package com.example.municipalidadprovincialdelsanta.model;
import jakarta.persistence.*;

@Entity
public class TipoTramite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String idTipo;

    private String nombreTipo;
    private Double costo;
    private Integer tiempoEstimado;

    // Constructor con parámetros
    public TipoTramite(String idTipo, String nombreTipo,
                       Double costo, Integer tiempoEstimado) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
        this.costo = costo;
        this.tiempoEstimado = tiempoEstimado;
    }

    // Constructor vacío
    public TipoTramite() {}

    // Métodos
    public void mostrarRequisitos() {
        System.out.println("Requisitos del trámite: " + this.nombreTipo);
    }

    public void actualizarCosto() {
        System.out.println("Costo actualizado para: " + this.nombreTipo + " -> S/." + this.costo);
    }

    public void calcularTiempo() {
        System.out.println("Tiempo estimado para " + this.nombreTipo + ": " + this.tiempoEstimado + " días");
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getIdTipo() { return idTipo; }
    public void setIdTipo(String idTipo) { this.idTipo = idTipo; }

    public String getNombreTipo() { return nombreTipo; }
    public void setNombreTipo(String nombreTipo) { this.nombreTipo = nombreTipo; }

    public Double getCosto() { return costo; }
    public void setCosto(Double costo) { this.costo = costo; }

    public Integer getTiempoEstimado() { return tiempoEstimado; }
    public void setTiempoEstimado(Integer tiempoEstimado) { this.tiempoEstimado = tiempoEstimado; }
}
