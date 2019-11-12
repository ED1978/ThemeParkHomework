public interface ITicketed {

    public Double defaultPrice();

    public Double priceFor(Visitor visitor);

}
