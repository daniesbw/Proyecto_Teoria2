package at.ls.neo4j.proyecto_neo;

import java.util.ArrayList;

public class Desarrollador {
    private int codigo;
    private String nombre;
    private ArrayList<String> lenguajes=new ArrayList();
    private ArrayList<String> tecnologias=new ArrayList();
    
    public Desarrollador(){
        
    }

    public Desarrollador(int codigo, String nombre, String lenguajes, String tecnologias) {
        this.codigo = codigo;
        this.nombre = nombre;
        
         String[] arrOfStr = lenguajes.split(";");
        for(int i = 0 ; i < arrOfStr.length; i ++){
            this.lenguajes.add(arrOfStr[i]);
        }
        String[] arrOfStr1 = tecnologias.split(";");
        for(int i = 0 ; i < arrOfStr1.length; i ++){
            this.tecnologias.add(arrOfStr1[i]);
        }
        
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(ArrayList<String> lenguajes) {
        this.lenguajes = lenguajes;
    }

    public ArrayList<String> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(ArrayList<String> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getLenguajestoString(){
        String ret = "[";
        for (int i = 0; i < this.lenguajes.size(); i++) {
            if (i!=this.lenguajes.size()-1) {
                 ret +=lenguajes.get(i)+", ";
            }else{
                 ret +=lenguajes.get(i);
            }
           
        }
        ret += "]";
        return ret;
    }
    
    public String getTecnologiastoString(){
        String ret = "[";
        for (int i = 0; i < this.tecnologias.size(); i++) {
            if (i!=this.tecnologias.size()-1) {
                 ret +=tecnologias.get(i)+", ";
            }else{
                 ret +=tecnologias.get(i);
            }
           
        }
        ret += "]";
        return ret;
    }
    
}
