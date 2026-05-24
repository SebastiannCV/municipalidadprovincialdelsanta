package com.example.municipalidadprovincialdelsanta.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Tramite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codigo;

    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    private String estado;
    private String descripcion;
    private String prioridad;

    // Constructor con parámetros
    public Tramite(String codigo, Date fechaRegistro, String estado,
                   String descripcion, String prioridad) {
        this.codigo = codigo;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    // Constructor vacío
    public Tramite() {}

    // Métodos
    public void iniciarTramite() {
        System.out.println("Trámite iniciado con código: " + this.codigo);
    }

    public void cambiarEstado() {
        System.out.println("Estado del trámite " + this.codigo + " cambiado a: " + this.estado);
    }

    public void generarReporte() {
        System.out.println("Reporte generado para el trámite: " + this.codigo);
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public Date getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(Date fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getPrioridad() { return prioridad; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }
}