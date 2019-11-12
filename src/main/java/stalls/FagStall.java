package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class FagStall extends Stall implements ISecurity {

    public FagStall(String ownerName){
        super("Fag stalls.Stall", ownerName);
    }

    public Boolean isAllowed(Visitor visitor){
        if (visitor.getAge() >= 18){
            return true;
        } else {
            return false;
        }
    }

}
