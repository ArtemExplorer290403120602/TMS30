package ChainOfResponsibilityPattern;

public class ConcreteHandler3 extends Handler{
    @Override
    public void handleRequest(int request) {
        if (request >= 20) {
            System.out.println("Request handled by ConcreteHandler3");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
