/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.profesor;
import model.profesorConsulta;

/**
 *
 * @author DELL
 */
public class controladorProfesor {

    public boolean resgistrarProfesor(String identificacion, String nombre, String apellido, int edad) {
        profesorConsulta ProfesorConsulta = new profesorConsulta();
        return ProfesorConsulta.registrarProfesor(identificacion, nombre, apellido, edad);
    }

    public List<profesor> consultarListaProfesores() {
        profesorConsulta ProfesorConsulta = new profesorConsulta();
        return ProfesorConsulta.consultarListaProfesores();
    }

    public boolean verificarSiExisteProfesor(String identificacion) {
        List<profesor> per = profesorConsulta.listaProfesores;
        for (profesor Persona : per) {
            if (Persona.getIdentificación().equals(identificacion)) {
                return true;
            }

        }
        return false;
    }

    public boolean actualizarEstudiante(String identificacion, String nombre, String apellido, int edad) {
        profesorConsulta ProfesorConsulta = new profesorConsulta();
        return ProfesorConsulta.actualizarProfesor(identificacion, nombre, apellido, edad);
    }
}
