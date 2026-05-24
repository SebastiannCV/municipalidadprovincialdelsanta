package com.example.municipalidadprovincialdelsanta.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class HistorialTramite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String idHistorial;

    @Temporal(TemporalType.DATE)
    private Date fechaCambio;

    private String estadoAnterior;
    private String estadoNuevo;
    private String observacion;

    // Constructor con parámetros
    public HistorialTramite(String idHistorial, Date fechaCambio, String estadoAnterior,
                            String estadoNuevo, String observacion) {
        this.idHistorial = idHistorial;
        this.fechaCambio = fechaCambio;
        this.estadoAnterior = estadoAnterior;
        this.estadoNuevo = estadoNuevo;
        this.observacion = observacion;
    }

    // Constructor vacío
    public HistorialTramite() {}

    // Métodos
    public void registrarCambio() {
        System.out.println("Cambio registrado: " + this.estadoAnterior + " -> " + this.estadoNuevo);
    }

    public void mostrarHistorial() {
        System.out.println("Historial del trámite: " + this.idHistorial);
    }

    public void buscarMovimiento() {
        System.out.println("Buscando movimiento en historial: " + this.idHistorial);
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getIdHistorial() { return idHistorial; }
    public void setIdHistorial(String idHistorial) { this.idHistorial = idHistorial; }

    public Date getFechaCambio() { return fechaCambio; }
    public void setFechaCambio(Date fechaCambio) { this.fechaCambio = fechaCambio; }

    public String getEstadoAnterior() { return estadoAnterior; }
    public void setEstadoAnterior(String estadoAnterior) { this.estadoAnterior = estadoAnterior; }

    public String getEstadoNuevo() { return estadoNuevo; }
    public void setEstadoNuevo(String estadoNuevo) { this.estadoNuevo = estadoNuevo; }

    public String getObservacion() { return observacion; }
    public void setObservacion(String observacion) { this.observacion = observacion; }
}
