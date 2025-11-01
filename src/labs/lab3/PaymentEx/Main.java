package labs.lab3.PaymentEx;

public class Main {
    public static void main(String[] args) {
        DebitAccount debit = new DebitAccount ( 100, 0.1);
        CreditAccount credit = new CreditAccount (100, 0.1, 2);

        System.out.println( " DebitAccount pay: " + debit.pay() );
        System.out.println( " CreditAccount pay: " + credit.pay() );
    }
}
