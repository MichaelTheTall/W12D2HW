package Attraction;

import Attraction.Attraction;
import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Main.Visitor;

public class Dodgems extends Attraction implements ITicketed, IReviewed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 4.50;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 12){
            return defaultPrice()/2;
        } else return defaultPrice();
    }
}
