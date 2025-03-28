/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.events.domain.mavenproject1;

import java.util.List;

/**
 *
 * @author Yisus
 */
public class EmbeddedSystemsProjectBuilder extends ProjectBuilder{
     @Override
    public void buildNombre(String nombre) {
        project.setNombre(nombre);
    }

    @Override
    public void buildEmpresa(String empresa) {
        project.setEmpresa(empresa);
    }

    @Override
    public void buildRequisitos(List<String> requisitos) {
        project.setRequisitos(requisitos);
    }

    @Override
    public void buildTecnologias(List<String> tecnologias) {
        project.setTecnologias(tecnologias);
    }

    @Override
    public void buildNumEstudiantes(int numEstudiantes) {
        project.setNumEstudiantes(numEstudiantes);
    }

    @Override
    public void buildDificultad(int numEstudiantes) {
        if (numEstudiantes <= 3) {
            project.setDificultad("Baja");
        } else if (numEstudiantes <= 5) {
            project.setDificultad("Mediana");
        } else {
            project.setDificultad("Alta");
        }
    }
}
