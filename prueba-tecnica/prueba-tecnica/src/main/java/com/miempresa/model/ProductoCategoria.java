package com.miempresa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Producto_Categoria")
public class ProductoCategoria {

    @Id
    private String productoCodigo;
    private Long categoriaId;

    @ManyToOne
    private Producto producto;

    @ManyToOne
    private Categoria categoria;

    // Getters y setters
    public String getProductoCodigo() {
        return productoCodigo;
    }

    public void setProductoCodigo(String productoCodigo) {
        this.productoCodigo = productoCodigo;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
