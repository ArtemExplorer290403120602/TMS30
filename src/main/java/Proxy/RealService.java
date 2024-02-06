package Proxy;

public class RealService implements Service{
    @Override
    public void doAction() {
        System.out.println("Real Service is doing the action");
    }
}
