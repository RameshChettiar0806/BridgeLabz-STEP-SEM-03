/*
 * You're creating a food ordering system. Design a class that can calculate delivery
charges in different ways:
● Basic delivery (just distance)
● Premium delivery (distance + priority fee)
● Group delivery (distance + number of orders discount)
● Festival special (distance + discount percentage + free delivery over certain
amount)
Each calculation should show a different message about the delivery cost breakdown.
 */

class BasicDelivery {
    public void calculate(double distance) {
        double cost = distance * 10; // Rs.10 per km
        System.out.println("Basic Delivery: Distance = " + distance + " km, Cost = Rs." + cost);
    }
}

class PremiumDelivery {
    public void calculate(double distance, double priorityFee) {
        double cost = distance * 10 + priorityFee;
        System.out.println("Premium Delivery: Distance = " + distance + " km, Priority Fee = Rs." + priorityFee + ", Total Cost = Rs." + cost);
    }
}

class GroupDelivery {
    public void calculate(double distance, int numOrders) {
        double base = distance * 10;
        double discount = numOrders * 5; // Rs.5 discount per order
        double cost = base - discount;
        if (cost < 0) cost = 0;
        System.out.println("Group Delivery: Distance = " + distance + " km, Orders = " + numOrders + ", Discount = Rs." + discount + ", Total Cost = Rs." + cost);
    }
}

class FestivalSpecial {
    public void calculate(double distance, double discountPercent, double orderAmount) {
        double base = distance * 10;
        double discount = base * (discountPercent / 100.0);
        double cost = base - discount;
        if (orderAmount >= 500) {
            System.out.println("Festival Special: Order Amount = Rs." + orderAmount + " (Free Delivery!)");
            cost = 0;
        } else {
            System.out.println("Festival Special: Distance = " + distance + " km, Discount = " + discountPercent + "%, Discount Amount = Rs." + discount + ", Total Cost = Rs." + cost);
        }
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        BasicDelivery bd = new BasicDelivery();
        PremiumDelivery pd = new PremiumDelivery();
        GroupDelivery gd = new GroupDelivery();
        FestivalSpecial fs = new FestivalSpecial();

        // Basic Delivery
        bd.calculate(5);

        // Premium Delivery
        pd.calculate(5, 50);

        // Group Delivery
        gd.calculate(5, 3);

        // Festival Special
        fs.calculate(5, 20, 400);
        fs.calculate(5, 20, 600); // Free delivery case
    }
}

