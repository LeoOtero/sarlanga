package com.sarlanga.test.domain.entity;


import javax.persistence.*;
@Entity
@Table(name = "Empleados")
public class EmpleadoEntity {

    @Id
    @Column(name = "ID", updatable = false, nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;
    @Column(name = "NroIdentificacion", nullable = false)
    private String nroIdentificacion;

    @Column(name = "TipoIdentificacion",nullable = false)
    private String tipoIdentificacion;

    @OneToOne (cascade=CascadeType.ALL)
    @JoinColumn(name="ID", unique= true, nullable=false, insertable=true, updatable=true)
    private InfoEmpleoActualEntity infoEmpleoActualEntity;

    @Column(name = "PrimerApellido", nullable = false)
    private String primerApellido;

    @Column(name = "SegundoApellido", nullable = false)
    private String segundoApellido;

    @Column(name = "PrimerNombre", nullable = false)
    private String primerNombre;

    @Column(name = "SegundoNombre", nullable = false)
    private String segundoNombre;

    @Column(name = "OtrosNombres")
    private String otrosNombres;


    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setSegundoNombre(String primerNombre) {
        this.segundoNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getOtrosNombres() {
        return otrosNombres;
    }

    public void setOtrosNombres(String otrosNombres) {
        this.otrosNombres = otrosNombres;
    }

    public String getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(String nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public InfoEmpleoActualEntity getInfoEmpleoActualEntity() {
        return infoEmpleoActualEntity;
    }

    public void setInfoEmpleoActualEntity(InfoEmpleoActualEntity infoEmpleoActualEntity) {
        this.infoEmpleoActualEntity = infoEmpleoActualEntity;
    }

}

