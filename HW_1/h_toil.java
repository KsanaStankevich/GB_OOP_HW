package Homework.HW_1;

public class h_toil extends hygiene {
    private int numblayers;

    public h_toil (String name, int price, int amount, int unit, int amountpack, int numblayers){
        super(name, price, amount, unit, amountpack);
        this.numblayers = numblayers;
    }

    @Override
    public String getInfo(){
        return String.format("%s  numblayers: %d", super.getInfo(), this.numblayers);
    }

}
