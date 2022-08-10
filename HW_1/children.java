package Homework.HW_1;

public class children extends products {
    private int minage;
    private String hypoall;

    public children (String name, int price, int amount, int unit, int minage, String hypoall){
        super(name, price, amount, unit);
        this.minage = minage;
        this.hypoall = hypoall;
    }

    @Override
    public String getInfo(){
        return String.format("%s  minage: %d , hypoall: %s", super.getInfo(), this.minage, this.hypoall);
    }
    
}
