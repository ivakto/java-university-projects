package labs.lab3.PaymentEx;

public class CreditAccount extends BankAccount {
    
    private int months;
    
    public CreditAccount(int months, double amount, double interest) {
        super(amount, interest);
        this.months = months;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    @Override
    public double pay(){
        double monthlyInterestRate = this.interest / 12.0;
        return this.amount * Math.pow((1 + monthlyInterestRate), this.months);
    }
}
