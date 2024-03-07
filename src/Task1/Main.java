package Task1;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add (new Customer("Mathias", "Falcham", "Falcho"));
        customerList.add(new Customer("Frederick","Franck","MojoOno"));
        customerList.add(new Customer("André","Samuelsen","TheDragon"));

        printCustomer(customerList);
    }
    public static void printCustomer(ArrayList<Customer>customerList){
       for(Customer customer : customerList){
           System.out.println(customer);
       }

    }

}

