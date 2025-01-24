package lab_1_recursividad;

public class PalindromoAir {
    private Ticket[] asientos = new Ticket[30];

    // Constructor
    public PalindromoAir() {
        
    }

   
    public int firstAvailable() {
        return firstAvailableHelper(0);
    }

    private int firstAvailableHelper(int index) {
        if (index >= asientos.length) {
            return -1; 
        }
        if (asientos[index] == null) {
            return index; 
        }
        return firstAvailableHelper(index + 1); 
    }

    public int searchPassenger(String name) {
        return searchPassengerHelper(name, 0);
    }

    private int searchPassengerHelper(String name, int index) {
        if (index >= asientos.length) {
            return -1; 
        }
        if (asientos[index] != null && asientos[index].getNombre().equals(name)) {
            return index; 
        }
        return searchPassengerHelper(name, index + 1); 
    }

    public boolean isPalindromo(String name) {
        return isPalindromoHelper(name, 0, name.length() - 1);
    }

    private boolean isPalindromoHelper(String name, int left, int right) {
        if (left >= right) {
            return true; 
        }
        if (name.charAt(left) != name.charAt(right)) {
            return false; 
        }
        return isPalindromoHelper(name, left + 1, right - 1); 
    }

    public void asignarAsiento(int posicion, Ticket ticket) {
        if (posicion >= 0 && posicion < asientos.length) {
            asientos[posicion] = ticket;
        }
    }

    public void printAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != null) {
                System.out.println("Asiento " + i + ":");
                asientos[i].print();
            } else {
                System.out.println("Asiento " + i + ": Disponible");
            }
        }
    }
}
