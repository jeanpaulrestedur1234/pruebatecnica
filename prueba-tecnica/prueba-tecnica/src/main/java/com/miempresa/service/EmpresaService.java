package com.miempresa.service;

import com.miempresa.model.Empresa;
import com.miempresa.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> getAllEmpresas() {
        return empresaRepository.findAll();
    }

    public Empresa createEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    // Otros métodos de actualización y eliminación
}
