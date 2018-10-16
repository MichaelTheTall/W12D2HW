package Attraction;

import Attraction.Attraction;
import Interfaces.ITicketed;
import Main.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name) {
        super(name);
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
