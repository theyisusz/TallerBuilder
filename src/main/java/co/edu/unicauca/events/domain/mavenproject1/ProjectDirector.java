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
public class ProjectDirector {
    private ProjectBuilder builder;

    public void setBuilder(ProjectBuilder builder) {
        this.builder = builder;
    }

    public Project buildProject(String nombre, String empresa, List<String> requisitos, List<String> tecnologias, int numEstudiantes) {
        builder.crearNuevoProyecto();
        builder.buildNombre(nombre);
        builder.buildEmpresa(empresa);
        builder.buildRequisitos(requisitos);
        builder.buildTecnologias(tecnologias);
        builder.buildNumEstudiantes(numEstudiantes);
        builder.buildDificultad(numEstudiantes);
        return builder.getProyecto();
    }
}
