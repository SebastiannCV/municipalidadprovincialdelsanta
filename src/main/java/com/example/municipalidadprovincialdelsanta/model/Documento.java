package com.example.municipalidadprovincialdelsanta.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String idDocumento;

    private String nombreDocumento;
    private String tipoDocumento;

    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;

    // Constructor con parámetros
    public Documento(String idDocumento, String nombreDocumento,
                     String tipoDocumento, Date fechaEntrega) {
        this.idDocumento = idDocumento;
        this.nombreDocumento = nombreDocumento;
        this.tipoDocumento = tipoDocumento;
        this.fechaEntrega = fechaEntrega;
    }

    // Constructor vacío
    public Documento() {}

    // Métodos
    public boolean validarDocumento() {
        System.out.println("Validando documento: " + this.nombreDocumento);
        return true;
    }

    public void subirDocumento() {
        System.out.println("Documento subido: " + this.nombreDocumento);
    }

    public void eliminarDocumento() {
        System.out.println("Documento eliminado: " + this.nombreDocumento);
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getIdDocumento() { return idDocumento; }
    public void setIdDocumento(String idDocumento) { this.idDocumento = idDocumento; }

    public String getNombreDocumento() { return nombreDocumento; }
    public void setNombreDocumento(String nombreDocumento) { this.nombreDocumento = nombreDocumento; }

    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

    public Date getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(Date fechaEntrega) { this.fechaEntrega = fechaEntrega; }
}
