package com.miempresa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "Producto")
public class Producto {

    @Id
    private String codigo;

    private String nombre;
    private String caracteristicas;
    private BigDecimal precio;

    @Enumerated(EnumType.STRING)
    private Moneda moneda;

    @ManyToOne
    private Empresa empresa;

    @OneToMany(mappedBy = "producto")
    private Set<ProductoCategoria> categorias;

    public enum Moneda {
        USD, EUR, COP
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Set<ProductoCategoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<ProductoCategoria> categorias) {
        this.categorias = categorias;
    }
}
