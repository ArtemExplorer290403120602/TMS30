package Proxy;

public class ProxyService implements Service {
    private RealService realService;

    @Override
    public void doAction() {
        if (realService == null) {
            realService = new RealService();
        }

        System.out.println("Proxy Service is doing some actions before passing to Real Service");
        realService.doAction();
    }
}

