package Attraction;

import Attraction.Attraction;
import Interfaces.IReviewed;

public class Playground extends Attraction implements IReviewed {

    public Playground(String name, int rating) {
        super(name,rating);
    }

}
