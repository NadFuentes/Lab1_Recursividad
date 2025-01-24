/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_1_recursividad;
public class Ticket {
    String nombre; 
    double totalPagado; 

    public Ticket(String nombre, double totalPagado) {
        this.nombre = nombre;
        this.totalPagado = totalPagado;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void print(){
        System.out.println("Nombre pasajero: "+nombre);
        System.out.println("Total pagado: "+totalPagado);
    }
    
    
    
}
