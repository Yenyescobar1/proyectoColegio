/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class persona {

    private String identificacion;
    private String nombre;
    private String apellido;
    private int edad;

    public String getIdentificación() {
        return identificacion;
    }

    public void setIdentificación(String identificación) {
        this.identificacion = identificación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public persona(String identificacion, String nombre, String apellido, int edad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public boolean registrarPersona(String identificacion,
            String nombre,
            String apellido,
            int edad
    ) {
        try {

            //procede a intentar registrar
            this.identificacion = identificacion;
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            return true;
            //retorna verdadero o true si funciona
        } catch (Exception e) {
            //retorna falso o false si no funciona
            return false;
        }
    }
}
