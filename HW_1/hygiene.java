package Homework.HW_1;

public class hygiene extends products {
    private int amountpack;

    public hygiene (String name, int price, int amount, int unit, int amountpack){
        super(name, price, amount, unit);
        this.amountpack = amountpack;
    }

    @Override
    public String getInfo(){
        return String.format("%s  amountpack: %d", super.getInfo(), this.amountpack);
    }

}