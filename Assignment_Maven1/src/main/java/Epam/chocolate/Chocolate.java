package Epam.chocolate;

public class Chocolate  implements Comparable<Chocolate>{
    private String name;
    private int price;
    private int weight;
public Chocolate()
{

}
    public Chocolate(String name,int price,int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Chocolate o) {
        if(o.price > price)
            return 1;
        if(o.price < price)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight;
    }
}
