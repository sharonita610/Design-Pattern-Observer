package src.observerPattern;

public class Daniel implements  MyHouse{
    @Override
    public void publish(String notify) {
        System.out.println("Alert for Daniel : " + notify);
    }
}
