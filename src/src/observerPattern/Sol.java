package src.observerPattern;

public class Sol implements MyHouse{
    @Override
    public void publish(String notify) {
        System.out.println("Alert for Sol : "+ notify);
    }
}
