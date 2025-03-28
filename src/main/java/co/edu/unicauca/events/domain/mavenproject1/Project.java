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
public class Project {
    private String nombre;
    private String empresa;
    private List<String> requisitos;
    private List<String> tecnologias;
    private int numEstudiantes;
    private String dificultad;

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setRequisitos(List<String> requisitos) {
        this.requisitos = requisitos;
    }

    public void setTecnologias(List<String> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
    
    @Override
    public String toString() {
        return "Proyecto{" +
                "nombre='" + getNombre() + '\'' +
                ", empresa='" + getEmpresa() + '\'' +
                ", requisitos=" + getRequisitos() +
                ", tecnologias=" + getTecnologias() +
                ", numEstudiantes=" + getNumEstudiantes() +
                ", dificultad='" + getDificultad() + '\'' +
                '}';
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @return the requisitos
     */
    public List<String> getRequisitos() {
        return requisitos;
    }

    /**
     * @return the tecnologias
     */
    public List<String> getTecnologias() {
        return tecnologias;
    }

    /**
     * @return the numEstudiantes
     */
    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    /**
     * @return the dificultad
     */
    public String getDificultad() {
        return dificultad;
    }
}
