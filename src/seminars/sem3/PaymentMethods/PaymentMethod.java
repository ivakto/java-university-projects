package seminars.sem3.PaymentMethods;

public abstract class PaymentMethod {
    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();

    public void displayAmount() {
        System.out.println("Сума за плащане: " + amount + " BGN");
    }
}
