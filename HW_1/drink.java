package Homework.HW_1;

public class drink extends products {
    private int volume;
    
    public drink (String name, int price, int amount, int unit, int volume){
        super(name, price, amount, unit);
        this.volume = volume;    
    }

    @Override
    public String getInfo(){
        return String.format("%s  volume: %d", super.getInfo(), this.volume);
    }
}
