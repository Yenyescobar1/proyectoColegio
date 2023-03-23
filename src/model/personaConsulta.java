/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class personaConsulta {

    public static ArrayList<persona> ListaPersona = new ArrayList<>();

    public static boolean registrarPersona(String identificacion, String nombre, String apellido, int edad) {

        persona Persona = new persona(identificacion, nombre, apellido, edad);

        ListaPersona.add(Persona);
        return true;
    }

    public static ArrayList<persona> consultaPersona() {
        return ListaPersona;
    }

}
