package ChainOfResponsibilityPattern;

public class ConcreteHandler2 extends Handler{
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("Request handled by ConcreteHandler2");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
