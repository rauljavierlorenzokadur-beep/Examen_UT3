/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos.detalles;

/**
 *
 * @author aytha
 */
public class Direccion {
    private String calle;
    private String codigoPostal;
    private String ciudad;
public Direccion (String calle, String codigoPostal, String ciudad){
    this.calle = calle;
    this.codigoPostal = codigoPostal;
    this.ciudad = ciudad;   
}
@Override
public String toString(){
    return calle + "," "+ codigoPostal +" "," " + ciudad";
}
public String getciudad(){
    return ciudad;
}    
}
