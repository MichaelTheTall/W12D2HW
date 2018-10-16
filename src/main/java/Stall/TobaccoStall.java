package Stall;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Main.Visitor;
import Stall.Stall;

public class TobaccoStall extends Stall implements ISecurity, ITicketed {


    public TobaccoStall(String name, String owner, String parking) {
        super(name, owner, parking);
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
