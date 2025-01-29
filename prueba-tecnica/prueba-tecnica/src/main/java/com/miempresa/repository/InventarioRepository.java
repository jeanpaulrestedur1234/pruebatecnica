package com.miempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.model.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
    // Se puede agregar consultas personalizadas aquí si es necesario
    Inventario findByNombre(String nombre);
}
