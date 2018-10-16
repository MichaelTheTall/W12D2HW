package Stall;

import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Main.Visitor;
import Stall.Stall;

public class IceCreamStall extends Stall implements ITicketed, IReviewed {

    public IceCreamStall(String name, String owner, String parking, int rating) {
        super(name, owner, parking, rating);
    }

    public double defaultPrice(){
        return 2.80;
    }

    public double priceFor(Visitor visitor){
        return defaultPrice();
    }
}
