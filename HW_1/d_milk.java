package Homework.HW_1;

public class d_milk extends drink {
    private int fatperce;
    private int beforedate;
    
    public d_milk (String name, int price, int amount, int unit, int volume, int fatperce, int beforedate){
        super(name, price, amount, unit, volume);
        this.fatperce = fatperce;
        this.beforedate = beforedate;
    }

    @Override
    public String getInfo(){
        return String.format("%s  fatperce: %d , beforedate %d", super.getInfo(), this.fatperce, this.beforedate);
    }

}
