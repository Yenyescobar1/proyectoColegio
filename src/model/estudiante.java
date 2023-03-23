/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class estudiante extends persona {

    private List<curso> CursosMatriculados = new ArrayList<>();

    public void setCursosMatriculados(List<curso> CursosMatriculados) {
        this.CursosMatriculados = CursosMatriculados;
    }

    public List<curso> getCursosMatriculados() {
        return CursosMatriculados;

    }

    public estudiante(String identificacion, String nombre, String apellido, int edad) {
        super(identificacion, nombre, apellido, edad);
    }

    @Override
    public String toString() {
        return this.getNombre() + "" + "" + this.getApellido();
    }

}
