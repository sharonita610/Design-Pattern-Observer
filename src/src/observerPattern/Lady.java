package src.observerPattern;

public interface Lady {

    void subscribe(MyHouse house);
    void unsubscribe(MyHouse house);
    void notification(String notify);
}
