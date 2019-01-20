package clases;

import java.io.Serializable;

public class TrabajadorAPrueba extends Trabajador implements Serializable {
    
    protected int horasExtra; // horas extras para aumentar su salario a raz�n de $5 por cada hora acumulada

    public TrabajadorAPrueba(int horasExtra, String pNombre, String pCedula, String pDireccion, String pCargo, double pSalariobase) {
        super(pNombre, pCedula, pDireccion, pCargo, pSalariobase);
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    @Override
    public double totalSalario() {
        double total = salariobase + (horasExtra * 5);
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + " [TRABAJADOR A PRUEBA]" + " Horas Extra: " + horasExtra;
    }
    
}
