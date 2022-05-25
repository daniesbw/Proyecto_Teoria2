/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.ls.neo4j.proyecto_neo;

/**
 *
 * @author Daniel
 */
public class Proyecto {
    private String nombre;
    private String fecha_inicio;
    private String fecha_final;

    public Proyecto() {
    }

    public Proyecto(String nombre, String fecha_inicio, String fecha_final) {
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }
    
    
    
}
