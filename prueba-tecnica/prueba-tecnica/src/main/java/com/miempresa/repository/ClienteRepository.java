package com.miempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Se puede agregar consultas personalizadas aquí si es necesario
    Cliente findByNombre(String nombre);
}
