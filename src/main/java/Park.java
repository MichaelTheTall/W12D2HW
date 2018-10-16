public class Park extends Attraction implements ISecurity {

    public Park(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 15) {
            return false;
        } else return true;
    }
}
