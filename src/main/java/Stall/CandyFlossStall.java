package Stall;

import Interfaces.ITicketed;
import Main.Visitor;
import Stall.Stall;

public class CandyFlossStall extends Stall implements ITicketed {


    public CandyFlossStall(String name, String owner, String parking) {
        super(name, owner, parking);
    }

    public double defaultPrice(){
        return 4.20;
    }

    public double priceFor(Visitor visitor){
        return defaultPrice();
    }
}
