package seminars.sem4.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductFilterService {

    public static List<Product> getProductsByCategory(List<Product> products, String category) {
        return products.stream()
            .filter(p -> p.getCategory().equalsIgnoreCase(category))
            .sorted(Comparator.comparingDouble(Product::getPrice)) 
            .collect(Collectors.toList());
    }

    public static List<Product> getExpensiveProducts(List<Product> products, double minPrice) {
        return products.stream()
            .filter(p -> p.getPrice() > minPrice)
            .sorted(Comparator.comparingDouble(Product::getPrice).reversed()) 
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Laptop", 1500.00, "Electronics"),
            new Product("T-shirt", 25.00, "Apparel"),
            new Product("Monitor", 300.50, "Electronics"),
            new Product("Coffee Maker", 75.00, "Appliances"),
            new Product("Keyboard", 80.00, "Electronics")
        );

        System.out.println("Задача 2.1: Продукти по Категория (Electronics, Възходящ ред)");
        List<Product> electronics = getProductsByCategory(products, "Electronics");
        electronics.forEach(System.out::println);

        System.out.println("\n Задача 2.2: Скъпи Продукти (Цена > 100.00, Низходящ ред)");
        List<Product> expensive = getExpensiveProducts(products, 100.00);
        expensive.forEach(System.out::println);
    }
}
