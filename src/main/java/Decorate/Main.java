package Decorate;

public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        System.out.println(component.operation());

        Component decoratedComponentA = new ConcreteDecoratorA(component);
        System.out.println(decoratedComponentA.operation());

        Component decoratedComponentB = new ConcreteDecoratorB(decoratedComponentA);
        System.out.println(decoratedComponentB.operation());
    }
}
