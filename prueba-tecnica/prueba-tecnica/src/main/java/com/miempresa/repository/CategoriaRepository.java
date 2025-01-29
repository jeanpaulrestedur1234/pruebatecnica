package com.miempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // Se puede agregar consultas personalizadas aquí si es necesario
    Categoria findByNombre(String nombre);
}
