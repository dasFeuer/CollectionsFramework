package Exercise.CollectorsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
    private String name;
    private double price;

    public Product () {}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "  - " + name + " (Rs. " + price + ")";
    }

}
public class PartitionProducts {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 99000));
        products.add(new Product("Mobile", 57000));
        products.add(new Product("Tablets", 44000));
        products.add(new Product("Clothes", 7000));
        products.add(new Product("Charger", 3300));

        Map<Boolean, List<Product>> collect = products
                .stream()
                .collect(Collectors
                        .partitioningBy
                                (product -> product.getPrice() >= 50000));

        collect.forEach((prices, productList) -> {
            /*
             What is the Ternary Operator?
             The ternary operator is a shorthand way of writing an if-else condition in a single line:
             */
            System.out.println(prices ? "Expensive Products (≥ 50000):" : "Cheap Products (< 50000): "); // condition ? value_if_true : value_if_false;
            productList.forEach(System.out::println);
            System.out.println();
        });
    }
}
