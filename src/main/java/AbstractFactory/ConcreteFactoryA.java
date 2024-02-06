package AbstractFactory;

public class ConcreteFactoryA extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}