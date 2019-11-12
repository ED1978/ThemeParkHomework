public class FagStall extends Stall implements ISecurity{

    public FagStall(String ownerName, int rating){
        super("Fag Stall", ownerName, rating);
    }

    public Boolean isAllowed(Visitor visitor){
        if (visitor.getAge() >= 18){
            return true;
        } else {
            return false;
        }
    }

}
