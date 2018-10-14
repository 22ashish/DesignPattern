package creationalDesignPattern.abstractFactoryDesign;

 public class Client1 {
     private ProductA productA;
     private ProductB productB;
     private AbstractFactory factory;
     public Client1(AbstractFactory factory) {
         this.factory = factory;
     }
     public String operation() {
         System.out.println("Client : Delegating creating objects to a factory object.");
         productA = factory.createProductA();
         productB = factory.createProductB();
         // Doing something appropriate on the created objects.
         return "Hello World from " + productA.getName() + " and " + productB.getName() + "!";
     }
}
