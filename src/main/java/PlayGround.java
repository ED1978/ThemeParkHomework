public class PlayGround extends Attraction implements ISecurity {

    public PlayGround(){
        super("Playground", 0.00);
    }

    public Boolean isAllowed(Visitor visitor){
        if (visitor.getAge() < 16){
            return true;
        } else {
            return false;
        }
    }

}
