package src.observerPattern;

public class Estrella implements MyHouse {

    @Override
    public void publish(String notify) {
        System.out.println("Alert for Estrella : "+ notify);
    }
}
