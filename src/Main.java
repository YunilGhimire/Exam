import java.util.ArrayList;
import java.util.List;


import models.Tshirt;
import models.Order;

public class Main {
    public static void main(String[] args) {
        Tshirt item1 = new Tshirt("Gorkhali batman", 572, 1500, "Karuma", "gorkha ma batman bhako ko photo bhako shirt", new String[]{"Small", "Medium", "Large"});
        Tshirt item2 = new Tshirt("Nepal", 001, 500, "Gucci", "I love Nepal lekheko shirt", new String[]{"Small", "Medium", "Large"});
        Tshirt ite3 = new Tshirt("hoodie", 978, 1000, "Busido", "Blue hoodie which will give you warmth in winter", new String[]{"Small", "Medium", "Large"});
        item1.Tshirtdescription();
        item2.Tshirtdescription();
        Order order1 = new Order("Yunil", 123455, new int[]{2}, new double[]{3000.00});
        Order order2 = new Order("Shuban",976123, new int[]{1},new double[] {500.00} );
        order1.Bill();
        order2.Bill();
    }
}