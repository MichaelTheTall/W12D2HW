import Attraction.Dodgems;
import Attraction.Park;
import Attraction.Playground;
import Attraction.Rollercoaster;
import Main.ThemePark;
import Main.Visitor;
import Stall.CandyFlossStall;
import Stall.IceCreamStall;
import Stall.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    CandyFlossStall floss;
    Dodgems dodgems;
    IceCreamStall icecream;
    TobaccoStall tobacco;
    Rollercoaster roller;
    Playground playground;
    Park park;

    Visitor anna;
    Visitor bob;
    Visitor charlie;
    Visitor denise;
    Visitor emily;

    @Before
    public void before(){
        dodgems = new Dodgems("Dodgem This", 8);
        floss = new CandyFlossStall("Mental Floss", "Jenny", "C2", 5);
        icecream = new IceCreamStall("Ice To Meet You", "Ben", "B12", 7);
        tobacco = new TobaccoStall("Smoke on the Water", "Joe", "A24", 2);
        roller = new Rollercoaster("Keep on Rollin'", 10);
        playground = new Playground("The PlaySpace", 9);
        park = new Park("The Attraction.Park", 6);

        themePark = new ThemePark("Main.ThemePark",floss,dodgems,icecream,park,playground,roller,tobacco);

        anna = new Visitor("Anna",12, 110, 5.00);
        bob = new Visitor("bob",20, 180, 50.00);
        charlie = new Visitor("Charlie",18, 150, 60.00);
        denise = new Visitor("Denise",16, 135, 40.00);
        emily = new Visitor("Emily",28, 160, 100.00);


        themePark.addVisitor(anna);
        themePark.addVisitor(bob);
        themePark.addVisitor(charlie);
        themePark.addVisitor(denise);
        themePark.addVisitor(emily);
    }

    @Test
    public void getName(){
        assertEquals("Main.ThemePark", themePark.getName());
    }

    @Test
    public void getFloss(){
        assertEquals(floss, themePark.getFloss());
    }

    @Test
    public void getDodgems(){
        assertEquals(dodgems,themePark.getDodgems());
    }

    @Test
    public void getIceCream(){
        assertEquals(icecream, themePark.getIcecream());
    }

    @Test
    public void getPark() {
        assertEquals(park, themePark.getPark());
    }

    @Test
    public void getPlayground(){
        assertEquals(playground, themePark.getPlayground());
    }

    @Test
    public void getRollercoaster(){
        assertEquals(roller, themePark.getRollercoaster());
    }

    @Test
    public void getTobacco(){
        assertEquals(tobacco, themePark.getTobacco());
    }

    @Test
    public void getVisitorArray(){
        assertEquals(5, themePark.getVisitors().size());
    }

    @Test
    public void addVisitor(){
        themePark.addVisitor(anna);
        assertEquals(6, themePark.getVisitors().size());
    }

    @Test
    public void removeVisitor(){
        themePark.removeVisitor(anna);
        assertEquals(4, themePark.getVisitors().size());
    }

    @Test
    public void parkShut(){
        themePark.parkShut();
        assertEquals(0, themePark.getVisitors().size());
    }

    @Test
    public void visit(){
        assertEquals("Anna is visiting Keep on Rollin'!", themePark.visit(anna, roller));
    }
}

