public class RollerCoaster extends Attraction implements  ISecurity, ITicketed{

    public RollerCoaster(){
        super("Rollercoaster", 8.40);
    }

    public Boolean isAllowed(Visitor visitor){
        if(visitor.getAge() > 12 && visitor.getHeight() > 145){
            return true;
        } else {
            return false;
        }
    }


    public Double defaultPrice() {
        return getTicketPrice();
    }

    public Double priceFor(Visitor visitor) {
        Double priceForVisitor = defaultPrice();
        if(visitor.getHeight() > 200){
            priceForVisitor *= 2;
        }
        return priceForVisitor;
    }
}
