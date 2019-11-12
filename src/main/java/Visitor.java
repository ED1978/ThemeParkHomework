public class Visitor {

    private String name;
    private int age;
    private Double money;
    private int height;

    public Visitor(String name, int age, int height, Double money){
        this.name = name;
        this.age = age;
        this.money = money;
        this.height = height;
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

    public int getHeight(){
        return this.height;
    }

    public void increaseMoney(Double amount){
        this.money += amount;
    }

    public void decreaseMoney(Double amount){
        this.money -= amount;
    }

}
