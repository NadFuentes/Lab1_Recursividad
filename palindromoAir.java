package labprogramacionii.LabprograII;

public class palindromoAir {
    Ticket[] ticket = new Ticket[30];
    
    //a-n 
    public int firstAvailable() {
        return firstAvailableHelper(0);
    }

    private int firstAvailableHelper(int index) {
        if (index >= ticket.length) {
            return -1;
        }
        if (ticket[index] == null) {
            return index;
        }
        return firstAvailableHelper(index + 1);
    }
    
    //b -n
    public int searchPassenger(String name) {
        return searchPassengerHelper(name, 0);
    }

    private int searchPassengerHelper(String name, int index) {
        if (index >= ticket.length) {
            return -1;
        }
        if (ticket[index] != null && ticket[index].getNombre().equals(name)) {
            return index;
        }
        return searchPassengerHelper(name, index + 1);
    }
    
    //c-k
    private boolean isPalindromo(String name, int j){
    int i = name.length();
    if(i>=0){
      if(name.charAt(j)==name.charAt(i-1))
          return true;
      return false;
    }
    
    return false;
    }
    
    public boolean isPalindromo(String name){
    return isPalindromo(name,0);
    }
    
    //d-k
      private void printPassengers(int index) {
        
        if (index >= ticket.length) {
        if (ticket[index] != null) {
            ticket[index].print(); 
        }
        printPassengers(index + 1);
        }
    }
      
      public void printPassengers(){
      printPassengers(0);
      }
      
      
      //e
     public double income() {
    return incomeHelper(0);
}

private double incomeHelper(int index) {
    if (index >= ticket.length) {
        return 0.0; 
    }
    if (ticket[index] != null) {
        return ticket[index].getTotalPagado() + incomeHelper(index + 1); // Sumar ingresos del asiento actual
    }
    return incomeHelper(index + 1);
}
    
    //f-n
     public void reset() {
        resetHelper(0);
    }

    private void resetHelper(int index) {
        if (index >= ticket.length) {
            return; 
        }
        ticket[index] = null;
        resetHelper(index + 1); 
    }
    
    //g 
   public void sellTicket(String name) {
        int availableIndex = firstAvailable();
        if (availableIndex == -1) {
            System.out.println("No hay asientos disponibles.");
            return;
        }

        double precioBase = 800.0;
        double precioFinal = precioBase;

     
        if (isPalindromo(name)) {
            precioFinal = precioBase * 0.8; 
        }

        Ticket nuevoTicket = new Ticket(name, precioFinal);
        ticket[availableIndex] = nuevoTicket;

       
        System.out.println("Ticket vendido a " + name + ". Monto a pagar: $" + precioFinal);
    }

   
    public void asignarAsiento(int posicion, Ticket Ticket) {
        if (posicion >= 0 && posicion < ticket.length) {
            ticket[posicion] = Ticket;
        }
    }


      //h-k
      public boolean cancelTicket(String name, int i){
          if (i<ticket.length) {
              if(ticket[i]!=null && ticket[i].nombre.equals(name)){
              ticket[i]=null;
              return true;
              }
              cancelTicket(name,i+1);
          }
      return false;
      }
      
      
      //i
      public void dispach(){
      income();
      reset();
      }
  }

    
    
    

