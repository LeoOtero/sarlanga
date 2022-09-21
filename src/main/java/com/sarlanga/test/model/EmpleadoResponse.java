package com.sarlanga.test.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class EmpleadoResponse {

    private String primerApellido;

    private String segundoApellido;

    private String primerNombre;

    private String segundoNombre;

    private String otrosNombres;

    private String paisDeEmpleo;

    private String TipoIdentificacion;

    private String nroIdentificacion;

    private String correoElectroninco;

    private LocalDate fechaDeIngreso;

    private String area;

    private final String estado = "Activo";

    private LocalDateTime fechaYHoraDeRegistro;

}

