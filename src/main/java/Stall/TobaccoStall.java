package Stall;

import Interfaces.ISecurity;
import Main.Visitor;
import Stall.Stall;

public class TobaccoStall extends Stall implements ISecurity {


    public TobaccoStall(String name, String owner, String parking) {
        super(name, owner, parking);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() < 18) {
            return false;
        } else return true;
    }

}
