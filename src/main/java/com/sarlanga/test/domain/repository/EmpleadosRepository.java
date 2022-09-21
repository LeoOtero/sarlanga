package com.sarlanga.test.domain.repository;

import com.sarlanga.test.domain.entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpleadosRepository extends JpaRepository<EmpleadoEntity,Long> {

    List<EmpleadoEntity> findAll();
/*
     String crearEmpleado(CreateEmpleadoRequest req);*/

    boolean findByNroIdentificacionAndTipoIdentificacion(String nro, String tipo);
}
