package com.example.municipalidadprovincialdelsanta.model;
import jakarta.persistence.*;

@Entity
public class EmpleadoMunicipal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String idEmpleado;

    private String nombre;
    private String cargo;
    private String areaAsignada;

    // Constructor con parámetros
    public EmpleadoMunicipal(String idEmpleado, String nombre,
                             String cargo, String areaAsignada) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.cargo = cargo;
        this.areaAsignada = areaAsignada;
    }

    // Constructor vacío
    public EmpleadoMunicipal() {}

    // Métodos
    public void revisarTramite() {
        System.out.println("Trámite revisado por: " + this.nombre);
    }

    public void aprobarTramite() {
        System.out.println("Trámite aprobado por: " + this.nombre);
    }

    public void rechazarTramite() {
        System.out.println("Trámite rechazado por: " + this.nombre);
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(String idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getAreaAsignada() { return areaAsignada; }
    public void setAreaAsignada(String areaAsignada) { this.areaAsignada = areaAsignada; }
}
