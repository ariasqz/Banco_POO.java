
package com.mycompany.trabajobanco;

import java.util.ArrayList;


public class Cuenta {
    
    String tipoCuenta;
    double montoInicial;
    ArrayList<Movimiento> misMovimientos;

    public Cuenta() {
        misMovimientos = new ArrayList<Movimiento>();
    }
    
    public void addMovimiento (Movimiento m){
        
        misMovimientos.add(m);
    
    }

    public ArrayList<Movimiento> getMisMovimientos() {
        return misMovimientos;
    }

    public void setMisMovimientos(ArrayList<Movimiento> misMovimientos) {
        this.misMovimientos = misMovimientos;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }
    
    
}
