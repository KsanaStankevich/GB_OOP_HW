package Homework.HW_1;

public class f_eggs extends food {
    private int amountpack;

    public f_eggs (String name, int price, int amount, int unit, int beforedate, int amountpack){
        super(name, price, amount, unit, beforedate);
        this.amountpack = amountpack;
    }

    @Override
    public String getInfo(){
        return String.format("%s  amountpack: %d", super.getInfo(), this.amountpack);
    }
    
}
