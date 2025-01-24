package labprogramacionii.LabprograII;

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
