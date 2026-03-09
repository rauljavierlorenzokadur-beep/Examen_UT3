/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos1;

/**
 *
 * @author aytha
 */
public abstract class Envio {

    protected String idSeguimiento;
    protected double peso;
    protected Direccion direccion;
    protected String[] historialParadas = new String[3];

    // Constructor
    public Envio(String idSeguimiento, double peso, Direccion direccion) {
        this.idSeguimiento = idSeguimiento;
        this.peso = peso;
        this.direccion = direccion;

        // Inicialización del array en todas sus posiciones
        for (int i = 0; i < historialParadas.length; i++) {
            historialParadas[i] = "Sin registro";
        }
    }

    // Método abstracto
    public abstract double calcularPrecioFinal();

    public String[] getHistorialParadas() {
        return historialParadas;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Envio otro = (Envio) obj;
        return Objects.equals(this.idSeguimiento, otro.idSeguimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSeguimiento);
    }
}
