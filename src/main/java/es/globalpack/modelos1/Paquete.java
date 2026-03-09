/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos1;
import es.globalpack.modelos.detalles.Direccion;

/**
 *
 * @author aytha
 */
public class Paquete extends Envio implements Asegurable{
    //Adicion de su atributo propio
    protected double volumen;
   public Paquete(String idSeguimiento, double peso, Direccion direccion, double volumen){
           super(idSeguimiento, peso, direccion);
           this.volumen = volumen;
   }
        @Override
public double calcularPrecioFinal(){
       
       double precio = 5.0;
       if (peso > 5) {
           precio += (peso - 5) * 2.0;
       }
       if (volumen > 1) {
           precio += 10.0;
       }
       return precio;
   }
    @Override 
public double calcularSeguro(){
    return volumen * 0.03;
    }
}
