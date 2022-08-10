package Homework.HW_1;

public class c_diapers extends children {
    private String size;
    private int minweight;
    private int maxweight;
    private String type;

    public c_diapers (String name, int price, int amount, int unit, int minage, String hypoall, 
    String size, int minweight, int maxweight, String type){
        super(name, price, amount, unit, minage, hypoall);
        this.size = size;
        this.minweight = minweight;
        this.maxweight = maxweight;
        this.type = type;
    }
    
    @Override
    public String getInfo(){
        return String.format("%s  size: %s, minweight: %d, maxweight: %d, type: %s", 
        super.getInfo(), this.size, this.minweight, this.maxweight, this.type);
    }

}
