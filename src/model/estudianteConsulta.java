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
public class estudianteConsulta {

    private List<curso> CursosMatriculados;
    public static List<estudiante> ListadoEstudiantes = new ArrayList<>();

    public static boolean registrarEstudiantes(String identificacion, String nombre, String apellido, int edad) {

        estudiante estudiantes = new estudiante(identificacion, nombre, apellido, edad);

        ListadoEstudiantes.add(estudiantes);
        return true;
    }

    public static boolean matricularCurso(curso curso, estudiante Estudiante) {
        try {

            List<curso> CursosMatriculados = Estudiante.getCursosMatriculados();
            //se recorre el arreglo buscando si está matriculad
            for (int i = 0; i < CursosMatriculados.size(); i++) {
                //si se encuentra el curso pues no se hace el proceso
                if (CursosMatriculados.get(i).getCodigo() == curso.getCodigo()) {
                    return false;
                }
            }
            //si ya se verificó se procede a matricular y  se envía un true
            CursosMatriculados.add(curso);
            Estudiante.setCursosMatriculados(CursosMatriculados);
            return true;

        } catch (Exception e) {
            //en dado caso de tener un error simplemente devolvemos un false
            return false;
        }

    }

    public static List<estudiante> consultarListaEstudiantes() {
        return ListadoEstudiantes;
    }

    public List<curso> consultarListaMatriculados() {
        return CursosMatriculados;
    }

    public boolean editarMatriculaCurso(curso codigoAnterior, curso codigoActual, estudiante estudiante) {
        try {
            CursosMatriculados = estudiante.getCursosMatriculados();
            //se recorre el arreglo buscando si está matriculad
            for (int i = 0; i < CursosMatriculados.size(); i++) {
                if (CursosMatriculados.get(i).getCodigo() == codigoAnterior.getCodigo()) {
                    CursosMatriculados.set(i, codigoActual);
                    estudiante.setCursosMatriculados(CursosMatriculados);
                    return true;
                }
            }
            //si no encuentra nada
            return false;
        } catch (Exception e) {
            //en dado caso de tener un error simplemente devolvemos un false
            return false;
        }
    }

    public static boolean eliminarMatriculaCurso(int codigo, estudiante estudiante) {
        try {
            //traer la información de los cursos matriculados

            List<curso> CursosMatriculados = estudiante.getCursosMatriculados();
            //se recorre el arreglo buscando si está matriculado en el curso
            for (int i = 0; i < CursosMatriculados.size(); i++) {
                if (CursosMatriculados.get(i).getCodigo() == codigo) {
                    CursosMatriculados.remove(i);
                    estudiante.setCursosMatriculados(CursosMatriculados);
                    return true;
                }
            }
            //si llega a esta instrucción se marca como error
            return false;
        } catch (Exception e) {
            //en dado caso de tener un error simplemente devolvemos un false
            return false;
        }
    }

    public static boolean actualizarEstudiante(String identificacion, String nombre, String apellido, int edad) {
        try {
            int indice = -1;
            for (int i = 0; i < ListadoEstudiantes.size(); i++) {
                if (identificacion.equals(ListadoEstudiantes.get(i).getIdentificación())) {
                    indice = i;
                    break;
                }

            }
            if (indice == -1) {
                return false;
            }
            estudiante Estudiante = new estudiante(identificacion, nombre, apellido, edad);
            Estudiante.setIdentificación(identificacion);
            Estudiante.setNombre(nombre);
            Estudiante.setApellido(apellido);
            Estudiante.setEdad(edad);

            ListadoEstudiantes.set(indice, Estudiante);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

}
