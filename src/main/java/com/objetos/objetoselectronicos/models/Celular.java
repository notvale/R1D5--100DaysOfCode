package com.objetos.objetoselectronicos.models;

public class Celular extends RegistroEquipo{
    
    Integer tamanio_pantalla; 
    Integer zoom_camara; 
    Boolean smartphone;


    public Celular() {
        super();
}

 

    public Celular(String marca, Integer numero_serie, String modelo, Integer tamanio_pantalla, Integer zoom_camara,
            Boolean smartphone) {
        super(marca, numero_serie, modelo);
        this.tamanio_pantalla = tamanio_pantalla;
        this.zoom_camara = zoom_camara;
        this.smartphone = smartphone;
    }




    public Integer getTamanio_pantalla() {
        return tamanio_pantalla;
    }


    public void setTamanio_pantalla(Integer tamanio_pantalla) {
        this.tamanio_pantalla = tamanio_pantalla;
    }


    public Integer getZoom_camara() {
        return zoom_camara;
    }


    public void setZoom_camara(Integer zoom_camara) {
        this.zoom_camara = zoom_camara;
    }


    public Boolean getSmartphone() {
        return smartphone;
    }


    public void setSmartphone(Boolean smartphone) {
        this.smartphone = smartphone;
    }



    @Override
    public String toString() {
        return "Los datos del celular registrado son" + super.toString() + "tamaño pantalla" + tamanio_pantalla + ", zoom_camara=" + zoom_camara + ", smartphone="
                + smartphone ;
    }



}




 

    

    


