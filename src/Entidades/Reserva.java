package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {

    private int idReserva;
    private Mesa mesa;
    private String apellido;
    private int dni;
    private LocalDate fecha;
    private LocalTime hora;
    private boolean estado;

    public Reserva() {
    }

    public Reserva(Mesa mesa, String apellido, int dni, LocalDate fecha, LocalTime hora, boolean estado) {
        this.mesa = mesa;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Reserva(int idReserva, Mesa mesa, String apellido, int dni, LocalDate fecha, LocalTime hora, boolean estado) {
        this.idReserva = idReserva;
        this.mesa = mesa;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva " + idReserva + " - mesa " + mesa + '\n' + "Apellido " + apellido + ", DNI " + dni + ", fecha " + fecha + ", hora " + hora + ", est. " + estado;
    }
    
}
