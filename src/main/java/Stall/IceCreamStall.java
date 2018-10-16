package Stall;

import Interfaces.ITicketed;
import Main.Visitor;
import Stall.Stall;

public class IceCreamStall extends Stall implements ITicketed {

    public IceCreamStall(String name, String owner, String parking) {
        super(name, owner, parking);
    }

    public double defaultPrice(){
        return 2.80;
    }

    public double priceFor(Visitor visitor){
        return defaultPrice();
    }
}
