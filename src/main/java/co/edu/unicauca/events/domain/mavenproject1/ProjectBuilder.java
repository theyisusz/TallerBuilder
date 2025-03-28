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
public  abstract class ProjectBuilder {
    protected Project project;

    public void crearNuevoProyecto() {
        project = new Project();
    }

    public Project getProyecto() {
        return project;
    }

    public abstract void buildNombre(String nombre);
    public abstract void buildEmpresa(String empresa);
    public abstract void buildRequisitos(List<String> requisitos);
    public abstract void buildTecnologias(List<String> tecnologias);
    public abstract void buildNumEstudiantes(int numEstudiantes);
    public abstract void buildDificultad(int numEstudiantes);
}
