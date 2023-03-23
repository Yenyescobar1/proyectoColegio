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
public class cursoConsulta {

    public static List<curso> ListaCursos = new ArrayList<>();

    public boolean agregarCurso(int codigo, String nombre, String identificacion) {
        curso cursoO = new curso();
        cursoO.setCodigo(codigo);
        cursoO.setNombre(nombre);
        cursoO.setIdentificacionDocentes(identificacion);
        ListaCursos.add(cursoO);
        return true;
    }

    public boolean editarCurso(int codigo, String nombre) {
        curso cursoO = null;
        int indice = -1;
        for (int i = 0; i < ListaCursos.size(); i++) {
            if (ListaCursos.get(i).getCodigo() == codigo) {
                cursoO = ListaCursos.get(i);
                indice = i;
            }
        }
        if (cursoO != null) {
            cursoO.setCodigo(codigo);
            cursoO.setNombre(nombre);
            ListaCursos.set(indice, cursoO);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarCurso(int codigo) {
        for (int i = 0; i < ListaCursos.size(); i++) {
            if (ListaCursos.get(i).getCodigo() == codigo) {
                ListaCursos.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<curso> consultarListaCurso() {
        return ListaCursos;
    }

    public curso consultarCursoPorCodigo(int codigo) {
        for (int i = 0; i < ListaCursos.size(); i++) {
            if (ListaCursos.get(i).getCodigo() == codigo) {
                return ListaCursos.get(i);
            }
        }
        return null;
    }

}
