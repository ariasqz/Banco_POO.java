
package com.mycompany.trabajobanco;

import java.util.ArrayList;


public class Cliente {
    
    String nombre;
    String telefono;
    String direccion;
    ArrayList<Cuenta> misCuentas;
    

    public Cliente() {
        
        misCuentas = new ArrayList<Cuenta>();
    }
    
    public void addCuenta (Cuenta c){
        
        misCuentas.add(c);
    
    }

    public ArrayList<Cuenta> getMisCuentas() {
        return misCuentas;
    }

    public void setMisCuentas(ArrayList<Cuenta> misCuentas) {
        this.misCuentas = misCuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
            
    
}
