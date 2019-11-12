public abstract class Attraction implements IReviewed {

    private String name;
    private int rating;
    private int visitCount;
    private Double ticketPrice;

    public Attraction(String name, Double ticketPrice){
        this.name = name;
        this.rating = rating;
        this.visitCount = visitCount;
        this.ticketPrice = ticketPrice;
    }

    public String getName(){
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }

    public int getVisitCount(){
        return this.visitCount;
    }

    public Double getTicketPrice(){
        return this.ticketPrice;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public void addVisit(){
        this.visitCount += 1;
    }

}
