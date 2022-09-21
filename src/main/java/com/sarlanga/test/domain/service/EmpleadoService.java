package com.sarlanga.test.domain.service;

import com.sarlanga.test.domain.entity.EmpleadoEntity;
import com.sarlanga.test.domain.repository.EmpleadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService implements  IEmpleadoService{
    @Autowired
    EmpleadosRepository empleadosRepository;
    @Override
    public void buscarEmpleados() {
        List<EmpleadoEntity> emp = empleadosRepository.findAll();
        String s = "";
    }
}
