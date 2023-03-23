/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.curso;
import model.cursoConsulta;

/**
 *
 * @author DELL
 */
public class controladorCurso {

    public boolean agregarCurso(int codigo, String nombre, String identificacionDocente) {
        cursoConsulta CursoConsulta = new cursoConsulta();
        return CursoConsulta.agregarCurso(codigo, nombre, identificacionDocente);
    }

    public boolean editarCurso(int codigo, String nombre) {
        cursoConsulta CursoConsulta = new cursoConsulta();
        return CursoConsulta.editarCurso(codigo, nombre);
    }

    public boolean eliminarCurso(int codigo) {
        cursoConsulta CursoConsulta = new cursoConsulta();
        return CursoConsulta.eliminarCurso(codigo);
    }

    public List<curso> consultarListaCurso() {
        cursoConsulta CursoConsulta = new cursoConsulta();
        return CursoConsulta.consultarListaCurso();
    }

    public curso consultarCursoPorCodigo(int codigo) {
        cursoConsulta CursoConsulta = new cursoConsulta();
        return CursoConsulta.consultarCursoPorCodigo(codigo);
    }

    public boolean verificarSiExisteEstudiante(int codigo) {
        List<curso> per = cursoConsulta.ListaCursos;
        for (curso Persona : per) {
            if (Persona.getCodigo() == (codigo)) {
                return true;
            }

        }
        return false;
    }

}
