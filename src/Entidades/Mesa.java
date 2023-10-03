package Entidades;

public class Mesa {

    private int idMesa;
    private int capacidad;
    private SituacionMesa situacion;
    private boolean estado;

    public Mesa() {
    }

    public Mesa(int capacidad, SituacionMesa situacion, boolean estado) {
        this.capacidad = capacidad;
        this.situacion = situacion;
        this.estado = estado;
    }

    public Mesa(int idMesa, int capacidad, SituacionMesa situacion, boolean estado) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
        this.situacion = situacion;
        this.estado = estado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public SituacionMesa getSituacion() {
        return situacion;
    }

    public void setSituacion(SituacionMesa situacion) {
        this.situacion = situacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    @Override
    public String toString() {
        return "Mesa " + idMesa + ", cap. " + capacidad + ", est. " + situacion ;
    }
    
    

}
