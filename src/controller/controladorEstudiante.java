/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import java.util.Optional;
import model.curso;
import model.estudiante;
import model.estudianteConsulta;

/**
 *
 * @author DELL
 */
public class controladorEstudiante {

    public boolean matricularCurso(curso codigo, String identificacion) {

        Optional<estudiante> Estudiante = estudianteConsulta.ListadoEstudiantes.stream().
                filter(e -> e.getIdentificación().equals(identificacion)).findFirst();

        if (Estudiante.isEmpty()) {
            //mensaje
            return false;
        }

        estudianteConsulta EstudianteConsulta = new estudianteConsulta();
        return EstudianteConsulta.matricularCurso(codigo, Estudiante.get());
    }

    public boolean editarMatriculaCurso(curso codigoAnterior, curso codigoActual, estudiante estudiante) {
        estudianteConsulta EstudianteConsulta = new estudianteConsulta();
        return EstudianteConsulta.editarMatriculaCurso(codigoAnterior, codigoActual, estudiante);
    }

    public boolean eliminarMatriculaCurso(int codigo, estudiante estudiante) {
        estudianteConsulta EstudianteConsulta = new estudianteConsulta();
        return EstudianteConsulta.eliminarMatriculaCurso(codigo, estudiante);
    }

    public List<estudiante> consultarListaEstudiantes() {
        estudianteConsulta EstudianteConsulta = new estudianteConsulta();
        return EstudianteConsulta.consultarListaEstudiantes();
    }

    public List<curso> consultarListaMatriculados(curso codigo, String identificacion) {

        Optional<estudiante> Estudiante = estudianteConsulta.ListadoEstudiantes.stream().
                filter(e -> e.getIdentificación().equals(identificacion)).findFirst();

        estudianteConsulta EstudianteConsulta = new estudianteConsulta();
        return EstudianteConsulta.consultarListaMatriculados();
    }

    public boolean resgistrarEstudiantes(String identificacion, String nombre, String apellido, int edad) {
        estudianteConsulta EstudianteConsulta = new estudianteConsulta();
        return EstudianteConsulta.registrarEstudiantes(identificacion, nombre, apellido, edad);
    }

    public boolean verificarSiExisteEstudiante(String identificacion) {
        List<estudiante> per = estudianteConsulta.ListadoEstudiantes;
        for (estudiante Persona : per) {
            if (Persona.getIdentificación().equals(identificacion)) {
                return true;
            }

        }
        return false;
    }

    public boolean actualizarEstudiante(String identificacion, String nombre, String apellido, int edad) {
        estudianteConsulta EstudianteConsulta = new estudianteConsulta();
        return EstudianteConsulta.actualizarEstudiante(identificacion, nombre, apellido, edad);
    }
}
