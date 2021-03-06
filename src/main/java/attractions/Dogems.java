package attractions;

import attractions.Attraction;
import behaviours.ITicketed;
import people.Visitor;


public class Dogems extends Attraction implements ITicketed {

    public Dogems(){
        super("Dogems", 4.80);

    }

    public Double defaultPrice() {
        return getTicketPrice();
    }

    public Double priceFor(Visitor visitor) {
        Double priceForVisitor = defaultPrice();
        if(visitor.getAge() < 12){
            priceForVisitor /= 2;
        }
        return priceForVisitor;
    }
}
