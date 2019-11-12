public class PlayGround extends Attraction implements ISecurity {

    public PlayGround(int rating){
        super("Playground", rating);
    }

    public Boolean isAllowed(Visitor visitor){
        if (visitor.getAge() < 16){
            return true;
        } else {
            return false;
        }
    }

}
