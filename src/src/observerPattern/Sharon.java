package src.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Sharon implements Lady{

    private List<MyHouse> houseMate = new ArrayList<>();

    public void backToHome(){
        System.out.println("Sharon came back!");
        notification("Sharon is back!!! WARN!");
    }

    public void eatFood(){
        System.out.println("Sharon is eating something!");
        notification("Is Sharon eating pizza???");
    }

    public void goWalk(){
        System.out.println("Sharon is going for a walk");
        notification("Sharon is walking with Coco");
    }

    @Override
    public void subscribe(MyHouse house) {
        houseMate.add(house);
    }

    @Override
    public void unsubscribe(MyHouse house) {
        houseMate.remove(house);

    }

    @Override
    public void notification(String notify) {

        houseMate.forEach(myHouse -> myHouse.publish(notify));

    }
}
