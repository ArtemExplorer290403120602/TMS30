package AbstractFactory;

public class ConcreteFactoryB extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}