package com.objetos.objetoselectronicos.models;

public class RegistroEquipo {

    String marca; 
    Integer numero_serie;
    String modelo; 
   

    public RegistroEquipo() {
    }

    public RegistroEquipo(String marca, Integer numero_serie, String modelo) {
        this.marca = marca;
        this.numero_serie = numero_serie;
        this.modelo = modelo;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(Integer numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

  

@Override
public String toString() {
    return "[marca=" + marca + ", numero_serie=" + numero_serie + ", modelo=" + modelo + "]";
}

      

    
    
    
}
