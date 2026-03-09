/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.main;
import es.globalpack.modelos.detalles.Direccion;
import es.globalpack.modelos1;

/**
 *
 * @author aytha
 */
public class Principal {

    public static void main(String[] args) {

        // Instanciar una Direccion y un Paquete con datos inventados
        Direccion direccion = new Direccion("Calle Examen 123", "35001", "Las Palmas");
        Paquete paquete = new Paquete("PK001", 7.0, direccion, 2.0);

        // Acceso al array del historial del paquete y registro de datos
        paquete.getHistorialParadas()[0] = "Madrid";
        paquete.getHistorialParadas()[1] = "Sevilla";

        // Uso de bucle for y atributo .length
        System.out.println("Historial de paradas:");
        for (int i = 0; i < paquete.getHistorialParadas().length; i++) {
            System.out.println(paquete.getHistorialParadas()[i]);
        }

        // Mostrar precio final y seguro
        double precioFinal = paquete.calcularPrecioFinal();
        double seguro = paquete.calcularSeguro();

        System.out.println("Precio final: " + precioFinal + " €");
        System.out.println("Seguro: " + seguro + " €");
    }
}
