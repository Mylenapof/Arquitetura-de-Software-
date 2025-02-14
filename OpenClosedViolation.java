
public class OpenClosedViolation {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("Regular Discount: " + calculator.calculateDiscount(new RegularCustomer(), 200));
        System.out.println("VIP Discount: " + calculator.calculateDiscount(new VipCustomer(), 200));
        System.out.println("Premium Discount: " + calculator.calculateDiscount(new PremiumCustomer(), 200));
    }
}

// Interface para diferentes estratégias de desconto
interface DiscountStrategy {
    double applyDiscount(double amount);
}

// Implementação de desconto para clientes regulares
class RegularCustomer implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.1;
    }
}

// Implementação de desconto para clientes VIP
class VipCustomer implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.2;
    }
}

// Novo tipo de cliente (Premium) sem modificar DiscountCalculator
class PremiumCustomer implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.15;
    }
}

// Calculadora de descontos que segue OCP
class DiscountCalculator {
    public double calculateDiscount(DiscountStrategy strategy, double amount) {
        return strategy.applyDiscount(amount);
    }
}
