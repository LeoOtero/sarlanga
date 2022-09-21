package com.sarlanga.test.domain.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "InfoEmpleoActual")
public class InfoEmpleoActualEntity {

    @Id
    @Column(name = "ID", updatable = false, nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;

    @Column(name = "CorreoElectroninco", nullable = false, unique = true)
    private String correoElectroninco;

    @Column(name = "PaisDeEmpleo", nullable = false)
    private String paisDeEmpleo;

    @Column(name = "FechaDeIngreso")
    private Date fechaDeIngreso;

    @Column(name = "FechaDeEdicion")
    private Date fechaDeEdicion;

    @Column(name = "Area", nullable = false)
    private String area;

    @Column(name = "Estado", nullable = false)
    private final String estado = "Activo";

    @Column(name = "FechaYHoraDeRegistro", nullable = false)
    private Date fechaYHoraDeRegistro;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCorreoElectroninco() {
        return correoElectroninco;
    }

    public void setCorreoElectroninco(String correoElectroninco) {
        this.correoElectroninco = correoElectroninco;
    }

    public String getPaisDeEmpleo() {
        return paisDeEmpleo;
    }

    public void setPaisDeEmpleo(String paisDeEmpleo) {
        this.paisDeEmpleo = paisDeEmpleo;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public Date getFechaDeEdicion() {
        return fechaDeEdicion;
    }

    public void setFechaDeEdicion(Date fechaDeEdicion) {
        this.fechaDeEdicion = fechaDeEdicion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaYHoraDeRegistro() {
        return fechaYHoraDeRegistro;
    }

    public void setFechaYHoraDeRegistro(Date fechaYHoraDeRegistro) {
        this.fechaYHoraDeRegistro = fechaYHoraDeRegistro;
    }
}
