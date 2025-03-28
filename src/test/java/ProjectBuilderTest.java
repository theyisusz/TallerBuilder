/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import co.edu.unicauca.events.domain.mavenproject1.DataScienceProjectBuilder;
import co.edu.unicauca.events.domain.mavenproject1.EmbeddedSystemsProjectBuilder;
import co.edu.unicauca.events.domain.mavenproject1.Project;
import co.edu.unicauca.events.domain.mavenproject1.ProjectBuilder;
import co.edu.unicauca.events.domain.mavenproject1.ProjectDirector;
import co.edu.unicauca.events.domain.mavenproject1.SoftwareProjectBuilder;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
 
/**
 *
 * @author Yisus
 */
public class ProjectBuilderTest {

    
 private ProjectDirector director;

    @BeforeEach
    void setUp() {
        director = new ProjectDirector();
    }

    @Test
    void testSoftwareProjectBuilder() {
        ProjectBuilder builder = new SoftwareProjectBuilder();
        director.setBuilder(builder);

        Project project = director.buildProject(
                "Sistema de Gestión de Inventarios",
                "TechCorp",
                List.of("Gestión de productos", "Manejo de stock", "Generación de reportes"),
                List.of("Java", "Spring Boot", "PostgreSQL"),
                4
        );

        assertNotNull(project);
        assertEquals("Sistema de Gestión de Inventarios", project.toString().contains("Sistema de Gestión de Inventarios") ? project.getNombre() : "");
        assertEquals("TechCorp", project.toString().contains("TechCorp") ? project.getEmpresa() : "");
        assertEquals(4, project.toString().contains("numEstudiantes=4") ? project.getNumEstudiantes() : 0);
        assertEquals("Mediana", project.toString().contains("Mediana") ? project.getDificultad() : "");
    }

    @Test
    void testDataScienceProjectBuilder() {
        ProjectBuilder builder = new DataScienceProjectBuilder();
        director.setBuilder(builder);

        Project project = director.buildProject(
                "Análisis Predictivo de Ventas",
                "DataCorp",
                List.of("Análisis de tendencias", "Predicción de demanda", "Optimización de inventarios"),
                List.of("Python", "Pandas", "TensorFlow"),
                3
        );

        assertNotNull(project);
        assertEquals("Análisis Predictivo de Ventas", project.getNombre());
        assertEquals("DataCorp", project.getEmpresa());
        assertEquals(3, project.getNumEstudiantes());
        assertEquals("Baja", project.getDificultad());
    }

    @Test
    void testEmbeddedSystemsProjectBuilder() {
        ProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        director.setBuilder(builder);

        Project project = director.buildProject(
                "Sistema de Monitoreo de Temperatura",
                "IoT Solutions",
                List.of("Sensor de temperatura", "Comunicación Bluetooth", "Interfaz Web"),
                List.of("C", "Arduino", "ESP32"),
                5
        );

        assertNotNull(project);
        assertEquals("Sistema de Monitoreo de Temperatura", project.getNombre());
        assertEquals("IoT Solutions", project.getEmpresa());
        assertEquals(5, project.getNumEstudiantes());
        assertEquals("Mediana", project.getDificultad());
    }
}