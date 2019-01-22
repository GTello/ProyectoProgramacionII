package clases;

import java.io.Serializable;

public class TrabajadorFijo extends Trabajador implements Serializable {
        
    private int tiempoServicio;

    public TrabajadorFijo(int tiempoServicio, String pNombre, String pCedula, String pDireccion, String pCargo, double pSalariobase) {
        super(pNombre, pCedula, pDireccion, pCargo, pSalariobase);
        this.tiempoServicio = tiempoServicio;
    }

    @Override
    public double totalSalario() {
        double total = salariobase + (salariobase * 0.02 / 100);
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + "[TRABAJADOR FIJO]" + " Años de Servicio: " + tiempoServicio;
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }
    
}
