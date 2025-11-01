package labs.lab3.PaymentEx;

public interface Payable {
    double pay();
}

// Създайте interface Payable с абстрактен метод pay, който да връща double. Създайте абстрактен клас BankAccount, който имплементира интерфейс.
// Има две полета - amount, лихва с конструктор, гетър и сетър. Създайте конкретен клас DebitAccount, който наследва bankAccount и връща сумата + лихвата.
// Създайте CreditAccount (налседва BankAccount) има и месеци и pay метода изчислва сложна лихва. 