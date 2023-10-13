/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberos.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */
public class Bombero {
    private int id_Bombero;
    private int dni;
    private String nombre_ape;
    private String grupo_sang;
    private LocalDate fecha;
    private int celular;
    private int codBrigada;
    private boolean estado;

    public Bombero() {
    }

    public Bombero(int id_Bombero, int dni, String nombre_ape, String grupo_sang, LocalDate fecha, int celular, int codBrigada, boolean estado) {
        this.id_Bombero = id_Bombero;
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.grupo_sang = grupo_sang;
        this.fecha = fecha;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

    public Bombero(int dni, String nombre_ape, String grupo_sang, LocalDate fecha, int celular, int codBrigada, boolean estado) {
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.grupo_sang = grupo_sang;
        this.fecha = fecha;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

    public int getId_Bombero() {
        return id_Bombero;
    }

    public void setId_Bombero(int id_Bombero) {
        this.id_Bombero = id_Bombero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre_ape() {
        return nombre_ape;
    }

    public void setNombre_ape(String nombre_ape) {
        this.nombre_ape = nombre_ape;
    }

    public String getGrupo_sang() {
        return grupo_sang;
    }

    public void setGrupo_sang(String grupo_sang) {
        this.grupo_sang = grupo_sang;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bombero{" + "id_Bombero=" + id_Bombero + ", dni=" + dni + ", nombre_ape=" + nombre_ape + ", grupo_sang=" + grupo_sang + ", fecha=" + fecha + ", celular=" + celular + ", codBrigada=" + codBrigada + ", estado=" + estado + '}';
    }

   
}
