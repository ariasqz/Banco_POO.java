
package com.mycompany.trabajobanco;


public class Movimiento {
    
    String tipoMoviento;
    String fechaMovimiento;
    double monto;

    public Movimiento() {
    }

    public String getTipoMoviento() {
        return tipoMoviento;
    }

    public void setTipoMoviento(String tipoMoviento) {
        this.tipoMoviento = tipoMoviento;
    }

    public String getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(String fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
}
