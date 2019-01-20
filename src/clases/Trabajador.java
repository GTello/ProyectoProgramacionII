package clases;

import java.io.Serializable;

public abstract class Trabajador implements Serializable {
    
    protected String nombre;
    protected String cedula;
    protected String direccion;
    protected double salariobase;
    protected String cargo;
    
    public Trabajador() { }

    public Trabajador(String pNombre, String pCedula, String pDireccion, String pCargo, double pSalariobase) {
        nombre = pNombre;
        cedula = pCedula;
        direccion = pDireccion;
        cargo = pCargo;
        salariobase = pSalariobase;
    } 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(int salariobase) {
        this.salariobase = salariobase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + nombre + ", CEDULA: " + cedula + ", DIRECCION: " + direccion + ", SALARIO: " + salariobase + ", CARGO: " + cargo;
    }
   
    public abstract double totalSalario ();
}
