import src.observerPattern.*;

public class Main {
    public static void main(String[] args) {

        Sharon sharon = new Sharon();
        MyHouse daniel = new Daniel();
        MyHouse sol = new Sol();
        MyHouse estrella = new Estrella();

        sharon.subscribe(daniel);
        sharon.subscribe(sol);
        sharon.subscribe(estrella);

        sharon.backToHome();
        sharon.eatFood();
        sharon.unsubscribe(sol);
        sharon.goWalk();


    }
}