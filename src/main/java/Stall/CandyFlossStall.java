package Stall;

import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Main.Visitor;
import Stall.Stall;

public class CandyFlossStall extends Stall implements ITicketed, IReviewed {


    public CandyFlossStall(String name, String owner, String parking, int rating) {
        super(name, owner, parking, rating);
    }

    public double defaultPrice(){
        return 4.20;
    }

    public double priceFor(Visitor visitor){
        return defaultPrice();
    }
}
