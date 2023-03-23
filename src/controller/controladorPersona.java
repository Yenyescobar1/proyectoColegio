/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.persona;
import model.personaConsulta;

/**
 *
 * @author DELL
 */
public class controladorPersona {

    public boolean registrarPersona(
            String identificacion,
            String nombre,
            String apellido,
            int Edad) {

        return personaConsulta.registrarPersona(identificacion, nombre, apellido, Edad);
    }

    public ArrayList<persona> consultaPersona() {
        return personaConsulta.consultaPersona();

    }

    public boolean verificarSiExiste(String identificacion) {
        ArrayList<persona> per = personaConsulta.ListaPersona;
        for (persona Persona : per) {
            if (Persona.getIdentificación().equals(identificacion)) {
                return true;
            }

        }
        return false;
    }

}
