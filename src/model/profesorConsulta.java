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
public class profesorConsulta {

    public static List<profesor> listaProfesores = new ArrayList<>();

    public static boolean registrarProfesor(String identificacion, String nombre, String apellido, int edad) {

        profesor profesor = new profesor(identificacion, nombre, apellido, edad);

        listaProfesores.add(profesor);
        return true;

        /*
        si ya existe
        modificar
        elminar
        consultar
        consukta lista*/
    }

    public static List<profesor> consultarListaProfesores() {
        return listaProfesores;
    }

    public static boolean actualizarProfesor(String identificacion, String nombre, String apellido, int edad) {
        try {
            int indice = -1;
            for (int i = 0; i < listaProfesores.size(); i++) {
                if (identificacion.equals(listaProfesores.get(i).getIdentificación())) {
                    indice = i;
                    break;
                }

            }
            if (indice == -1) {
                return false;
            }
            profesor Profesor = new profesor(identificacion, nombre, apellido, edad);
            Profesor.setIdentificación(identificacion);
            Profesor.setNombre(nombre);
            Profesor.setApellido(apellido);
            Profesor.setEdad(edad);

            listaProfesores.set(indice, Profesor);
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}
