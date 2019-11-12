public class Visitor {

    private String name;
    private int age;
    private Double money;

    public Visitor(String name, int age, Double money){
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Double getMoney(){
        return this.money;
    }

    public void increaseMoney(Double amount){
        this.money += amount;
    }

    public void decreaseMoney(Double amount){
        this.money -= amount;
    }

}
