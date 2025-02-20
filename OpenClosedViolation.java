
public class OpenClosedViolation {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("Regular Discount: " + calculator.calculateDiscount(new RegularCustomer(), 200));
        System.out.println("VIP Discount: " + calculator.calculateDiscount(new VipCustomer(), 200));
        System.out.println("Premium Discount: " + calculator.calculateDiscount(new PremiumCustomer(), 200));
    }
}


interface DiscountStrategy {
    double applyDiscount(double amount);
}


class RegularCustomer implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.1;
    }
}


class VipCustomer implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.2;
    }
}


class PremiumCustomer implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.15;
    }
}


class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy, double amount) {
        return strategy.applyDiscount(amount);
    }
}
