package creationalDesignPattern.abstractFactoryDesign;

public class Factory2 implements AbstractFactory {
    public ProductA createProductA() {
        System.out.println("Factory2: Creating a ProductA2 object.");
        return new ProductA2();
    }
    public ProductB createProductB() {
        System.out.println("Factory2: Creating a ProductB2 object.");
        return new ProductB2();
    }
}
