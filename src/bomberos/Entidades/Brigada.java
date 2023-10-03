/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bomberos.Entidades;

/**
 *
 * @author Lenovo
 */
public class Brigada {
    private int codBrigada;
    private String nombre_br;
    private String especialidad;
    private boolean libre;
    private int codCuartel;

    public Brigada() {
    }

    public Brigada(int codBrigada, String nombre_br, String especialidad, boolean libre, int codCuartel) {
        this.codBrigada = codBrigada;
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.codCuartel = codCuartel;
    }

    public Brigada(String nombre_br, String especialidad, boolean libre, int codCuartel) {
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.codCuartel = codCuartel;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombre_br() {
        return nombre_br;
    }

    public void setNombre_br(String nombre_br) {
        this.nombre_br = nombre_br;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(int codCuartel) {
        this.codCuartel = codCuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "codBrigada=" + codBrigada + ", nombre_br=" + nombre_br + ", especialidad=" + especialidad + ", libre=" + libre + ", codCuartel=" + codCuartel + '}';
    }
    
    
}
