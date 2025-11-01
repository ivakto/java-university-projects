package labs.lab3.PaymentEx;

public class DebitAccount extends BankAccount{
    
    public DebitAccount (double amount, double interest) {
       super(amount, interest);
    }

    @Override
    public double pay() {
        double principal = getAmount(); 
        double interestRate = getInterest();
        double totalInterest = principal * interestRate;
        double totalAmount = principal + totalInterest;

        return totalAmount;
    }
}
