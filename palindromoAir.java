package labprogramacionii.LabprograII;

public class palindromoAir {
    Ticket[] ticket = new Ticket[30];
    
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
      
  }

    
    
    

