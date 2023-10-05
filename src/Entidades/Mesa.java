package Entidades;

public class Mesa {

    private int idMesa;
    private int numero;
    private int capacidad;
    private boolean estado;

    public Mesa() {
    }

    public Mesa(int capacidad, boolean estado,int numero) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa(int idMesa,int numero, int capacidad, boolean estado) {
        this.idMesa = idMesa;
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    @Override
    public String toString() {
        return "Mesa " + numero + ", cap. " + capacidad + ", est. " ;
    }
    
    

}
