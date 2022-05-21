package at.ls.neo4j.proyecto_neo;

public class Bug {
    private int codigo;
    private String descripcion;
    private int codigoProyecto, nivelUrgencia;
    private String estado, fechaInicio, fechaFinalizado; //nuevo, asignado, finalizado

    public Bug() {
    }

    public Bug(int codigo, String descripcion, int codigoProyecto, int nivelUrgencia, String estado, String fechaInicio, String fechaFinalizado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.codigoProyecto = codigoProyecto;
        this.nivelUrgencia = nivelUrgencia;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizado = fechaFinalizado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigoProyecto() {
        return codigoProyecto;
    }

    public void setCodigoProyecto(int codigoProyecto) {
        this.codigoProyecto = codigoProyecto;
    }

    public int getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(int nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizado() {
        return fechaFinalizado;
    }

    public void setFechaFinalizado(String fechaFinalizado) {
        this.fechaFinalizado = fechaFinalizado;
    }
    
    
    
    
}
