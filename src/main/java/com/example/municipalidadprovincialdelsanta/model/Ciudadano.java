package com.example.municipalidadprovincialdelsanta.model;
import jakarta.persistence.*;

@Entity
public class Ciudadano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String dni;

    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;

    // Constructor con parámetros
    public Ciudadano(String dni, String nombre, String direccion,
                     String telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Constructor vacío
    public Ciudadano() {}

    // Métodos
    public void registrarTramite() {
        System.out.println("Trámite registrado por el ciudadano: " + this.nombre);
    }

    public void consultarEstado() {
        System.out.println("Consultando estado del trámite para: " + this.nombre);
    }

    public void actualizarDatos() {
        System.out.println("Datos actualizados para el ciudadano: " + this.nombre);
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}
