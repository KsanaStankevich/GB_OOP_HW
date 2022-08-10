package Homework.HW_1;

public class f_bread  extends food {
    private String flourtype;

    public f_bread (String name, int price, int amount, int unit, int beforedate, String flourtype){
        super(name, price, amount, unit, beforedate);
        this.flourtype = flourtype;
    }

    @Override
    public String getInfo(){
        return String.format("%s  flourtype: %s", super.getInfo(), this.flourtype);
    }

}
