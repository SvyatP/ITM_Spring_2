package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;


    public void whatAnimalSay() {
        System.out.println("Animal says: " + animal);
        System.out.println("Time: " + timer.getTime());
    }

    public Timer getTimer() {
        return timer;
    }
}
