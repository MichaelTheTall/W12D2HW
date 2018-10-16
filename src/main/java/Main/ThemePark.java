package Main;

import Attraction.Attraction;
import Stall.CandyFlossStall;
import Stall.IceCreamStall;
import Stall.TobaccoStall;

import java.util.ArrayList;
import Attraction.Dodgems;
import Attraction.Park;
import Attraction.Playground;
import Attraction.Rollercoaster;

public class ThemePark {

    private String name;

    private CandyFlossStall floss;
    private Dodgems dodgems;
    private IceCreamStall icecream;
    private Park park;
    private Playground playground;
    private Rollercoaster rollercoaster;
    private TobaccoStall tobacco;
    private ArrayList<Visitor> visitors;
    public ThemePark(String name, CandyFlossStall floss, Dodgems dodgems, IceCreamStall icecream, Park park, Playground playground, Rollercoaster rollercoaster, TobaccoStall tobacco) {
        this.name = name;
        this.floss = floss;
        this.dodgems = dodgems;
        this.icecream = icecream;
        this.park = park;
        this.playground = playground;
        this.rollercoaster = rollercoaster;
        this.tobacco = tobacco;
        this.visitors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public CandyFlossStall getFloss() {
        return floss;
    }

    public Dodgems getDodgems() {
        return dodgems;
    }

    public IceCreamStall getIcecream() {
        return icecream;
    }

    public Park getPark() {
        return park;
    }

    public Playground getPlayground() {
        return playground;
    }

    public Rollercoaster getRollercoaster() {
        return rollercoaster;
    }

    public TobaccoStall getTobacco() {
        return tobacco;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }

    public void removeVisitor(Visitor visitor){
        visitors.remove(visitor);
    }

    public void parkShut(){
        visitors.clear();
    }

    public String visit(Visitor visitor, Attraction attraction){
        return visitor.getName() + " is visiting " + attraction.getName()+"!";
    }
}
