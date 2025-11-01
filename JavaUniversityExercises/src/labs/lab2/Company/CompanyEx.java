package labs.lab2.Company;

public class CompanyEx {
    public static void main(String[] args) {
        CompanyET company = new CompanyET("IVA", "01.01.2024", "1234567890", "Iva Todorova", 5000.00, 7500.00);
        company.setBullstat("123"); 
        System.out.println("Текущ Булстат: " + company.getBullstat());;
    }

}
