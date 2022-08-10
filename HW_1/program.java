package Homework.HW_1;


public class program {
    
    public static void main(String[] args) {
        Homework.HW_1.products bread_1 = new f_bread("Baton", 100, 3, 2, 27, "Пшеница");
        System.out.println(bread_1.getInfo());

        Homework.HW_1.products milk_1 = new d_milk("Molochnik", 10, 2, 3, 1, 20, 29);
        System.out.println(milk_1.getInfo());

        Homework.HW_1.products lemonade_1 = new d_lemonade("Cola", 50, 4, 1, 1);
        System.out.println(lemonade_1.getInfo());
    }

}
