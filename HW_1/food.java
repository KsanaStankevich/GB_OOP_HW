package Homework.HW_1;

public class food extends products{
    private int beforedate;

    public food (String name, int price, int amount, int unit, int beforedate){
        super(name, price, amount, unit);
        this.beforedate = beforedate;
    }

    @Override
    public String getInfo(){
        return String.format("%s  beforedate: %d", super.getInfo(), this.beforedate);
    }

}
