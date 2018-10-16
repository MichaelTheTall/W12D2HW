package Attraction;

import Attraction.Attraction;
import Interfaces.ISecurity;
import Main.Visitor;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 12 && visitor.getHeight() > 145) {
            return true;
        } else return false;
    }

}
