package Attraction;

import Attraction.Attraction;
import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Main.Visitor;

public class Park extends Attraction implements ISecurity, IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 15) {
            return false;
        } else return true;
    }
}
