/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos1;

/**
 *
 * @author aytha
 */
public class Sobre extends Envio {
    private boolean esAcolchado;
    
    public Sobre(String idSeguimiento, double peso, Direccion direccion, booleand esAcolchado){
            super(idSeguimiento, peso, direccion);
            this.esAcolchado = esAcolchado;
    }            
    
    @Override 
    public double calcularPrecioFinal(){
        double precio = 2.0;
        
        if (esAcolchado){
            precio += 1.0;
        }
        if (direccion.getCiudad().equalsIgnoreCase("Las palmas")){
            precio -= 0.5;
    }
}
