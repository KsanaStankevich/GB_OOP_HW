package Homework.HW_1;

public class products {
    
    private String name;
    private int price;
    private int amount;
    private int unit;

    public products (String name, int price, int amount, int unit){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }
    
    public String getInfo(){
        return String.format("name: %s , price: %d , amount: %d , unit: %d",
                this.name, this.price, this.amount, this.unit);
    }
}
