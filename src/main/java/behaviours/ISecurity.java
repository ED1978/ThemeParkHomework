package behaviours;

import people.Visitor;

public interface ISecurity {

    public Boolean isAllowed(Visitor visitor);

}
