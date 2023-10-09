package Entidades;

public class Mesa {

    private int idMesa;
    private int numero;
    private int capacidad;
    private boolean estado;
    private boolean ocupada;

    public Mesa() {
    }

    public Mesa(int capacidad, boolean estado,int numero,boolean ocupada) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
        this.ocupada = ocupada;
    }

    public Mesa(int idMesa,int numero, int capacidad, boolean estado,boolean ocupada) {
        this.idMesa = idMesa;
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = estado;
        this.ocupada = ocupada;
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

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    

    @Override
    public String toString() {
        return "Mesa " + numero + ", cap. " + capacidad + ", est. " ;
    }
    
    

}
