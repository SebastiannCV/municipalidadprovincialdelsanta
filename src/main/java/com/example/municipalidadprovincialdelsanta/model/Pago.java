package com.example.municipalidadprovincialdelsanta.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String idPago;

    private Double monto;

    @Temporal(TemporalType.DATE)
    private Date fechaPago;

    private String metodoPago;
    private String estadoPago;

    // Constructor con parámetros
    public Pago(String idPago, Double monto, Date fechaPago,
                String metodoPago, String estadoPago) {
        this.idPago = idPago;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
    }

    // Constructor vacío
    public Pago() {}

    // Métodos
    public void realizarPago() {
        System.out.println("Pago realizado: S/." + this.monto + " via " + this.metodoPago);
    }

    public void generarComprobante() {
        System.out.println("Comprobante generado para el pago: " + this.idPago);
    }

    public boolean verificarPago() {
        System.out.println("Verificando pago: " + this.idPago);
        return true;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getIdPago() { return idPago; }
    public void setIdPago(String idPago) { this.idPago = idPago; }

    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }

    public Date getFechaPago() { return fechaPago; }
    public void setFechaPago(Date fechaPago) { this.fechaPago = fechaPago; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public String getEstadoPago() { return estadoPago; }
    public void setEstadoPago(String estadoPago) { this.estadoPago = estadoPago; }
}
