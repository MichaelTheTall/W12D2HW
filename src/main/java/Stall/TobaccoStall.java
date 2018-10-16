package Stall;

import Interfaces.IReviewed;
import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Main.Visitor;
import Stall.Stall;

public class TobaccoStall extends Stall implements ISecurity, ITicketed, IReviewed {


    public TobaccoStall(String name, String owner, String parking, int rating) {
        super(name, owner, parking, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() < 18) {
            return false;
        } else return true;
    }

    public double defaultPrice(){
        return 6.60;
    }

    public double priceFor(Visitor visitor){
       return defaultPrice();
    }

}
