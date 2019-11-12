public class RollerCoaster extends Attraction implements  ISecurity{

    public RollerCoaster(int rating){
        super("Rollercoaster", rating);
    }

    public Boolean isAllowed(Visitor visitor){
        if(visitor.getAge() > 12 && visitor.getHeight() > 145){
            return true;
        } else {
            return false;
        }
    }


}
