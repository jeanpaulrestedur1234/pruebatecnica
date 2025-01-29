package com.miempresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miempresa.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    Empresa findByNombre(String nombre);  // Método para encontrar una empresa por nombre
}
