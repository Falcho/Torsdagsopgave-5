package Task1;

class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = this.counter;
        this.counter = this.counter + 1;
    }

    @Override
    public String toString() {
        return "Customer ID: " + (id+1) +
                 ", Name: " + firstName +" "+ lastName+
                ", Username: " + username;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }
}