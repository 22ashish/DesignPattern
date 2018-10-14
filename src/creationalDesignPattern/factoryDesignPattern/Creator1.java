package creationalDesignPattern.factoryDesignPattern;

public class Creator1 extends Creator {
    public Product factoryMethod() {
        return new Product1();
    }
}