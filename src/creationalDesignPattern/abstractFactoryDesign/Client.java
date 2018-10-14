package creationalDesignPattern.abstractFactoryDesign;

public class Client {
    public static void main(String[] args) {
        // Creating a Client object
        // and configuring it with a factory object.
        Client1 client = new Client1(new Factory1());
        // Calling an operation on the client.
        System.out.println(client.operation());
    }
}
