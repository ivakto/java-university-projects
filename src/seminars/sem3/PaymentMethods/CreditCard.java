package seminars.sem3.PaymentMethods;

public class CreditCard extends PaymentMethod{
    private String cardNumber;

    public CreditCard(double amount, String cardNumber) {
        super(amount); 
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        displayAmount(); 
        System.out.println("Карта №: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
    }
}
