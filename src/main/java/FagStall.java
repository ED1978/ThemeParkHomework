public class FagStall extends Stall implements ISecurity{

    public FagStall(String ownerName){
        super("Fag Stall", ownerName);
    }

    public Boolean isAllowed(Visitor visitor){
        if (visitor.getAge() >= 18){
            return true;
        } else {
            return false;
        }
    }

}
