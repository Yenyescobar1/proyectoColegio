/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class curso {

    private String nombre;
    private String identificacionDocentes;
    private int codigo;

    curso() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getIdentificacionDocentes() {
        return identificacionDocentes;
    }

    public void setIdentificacionDocentes(String identificacionDocentes) {
        this.identificacionDocentes = identificacionDocentes;
    }

    public curso(String nombre, String identificacionDocentes, int codigo) {
        this.nombre = nombre;
        this.identificacionDocentes = identificacionDocentes;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
