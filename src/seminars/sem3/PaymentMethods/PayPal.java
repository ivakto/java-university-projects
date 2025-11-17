package seminars.sem3.PaymentMethods;

public class PayPal extends PaymentMethod{
    private String email;

    public PayPal(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        displayAmount();
        System.out.println("Използван PayPal акаунт: " + email);
    }
}
