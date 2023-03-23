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
public class profesor extends persona {

    private List<curso> cursosImparte = new ArrayList<>();

    public List<curso> getCursosImparte() {
        return cursosImparte;
    }

    public void setCursosImparte(List<curso> cursosImparte) {
        this.cursosImparte = cursosImparte;
    }

    public profesor(String identificacion, String nombre, String apellido, int edad) {
        super(identificacion, nombre, apellido, edad);
    }

}
