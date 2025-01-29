package com.miempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
    // Se puede agregar consultas personalizadas aquí si es necesario
    Orden findByNumeroOrden(String numeroOrden);
}
