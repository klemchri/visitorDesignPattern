import java.util.List; 

public class PrototypePatternTest { 
    public static void main(String args[]){ 
        try { 
            Customers customers = new Customers(); 
            customers.loadDataFromDB(); //Füllt unsere List mit Testdaten 

//ToDo: Hier kommt der Quelltext der Aufgabe rein 😉 
        
            //Customer clonen
            Customers customers1 = (Customers) customers.clone();
            Customers customers2 = (Customers) customers.clone();

            customer1.getCustomerList().add("Hans");
            customer2.getCustomerList().remove("Bharat");


            System.out.println("0");
            System.out.println("Customers List: " + customers.getCustomerList());


            System.out.println("1");
            System.out.println("Customers List: " + customers1.getCustomerList());

            
            System.out.println("2");
            System.out.println("Customers List: " + customers2.getCustomerList());
    
    } catch (CloneNotSupportedException e) { 
            e.printStackTrace(); 
    } 
  } 
} 
