package creationalDesignPattern.abstractFactoryDesign;

public class Factory1 implements AbstractFactory {
    public ProductA createProductA() {
        System.out.println("Factory1: Creating a ProductA1 object.");
        return new ProductA1();
    }
    public ProductB createProductB() {
        System.out.println("Factory1: Creating a ProductB1 object.");
        return new ProductB1();
    }
}
