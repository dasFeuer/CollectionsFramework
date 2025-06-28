package Exercise.StreamsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group Products by Category
class Product {
    private String name;
    private double price;
    private String category;

    public Product () {}

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return name +
                " (price " + price + ", "
                + category + ")\n";

    }
}
public class GroupProducts {
    public static void main(String[] args) {
        List<Product> groupProducts = new ArrayList<>();
        groupProducts.add(new Product("Google Pixel", 89000, "Mobile"));
        groupProducts.add(new Product("Lufthansa", 1100000000, "Plane"));
        groupProducts.add(new Product("Iphone", 120000, "Mobile"));
        groupProducts.add(new Product("Air Bus", 210000000, "Plane"));
        groupProducts.add(new Product("BMW", 3600000, "Auto"));
        groupProducts.add(new Product("Samsung", 69000, "Mobile"));
        groupProducts.add(new Product("Mercedes Benz", 4700000, "Auto"));

        Map<String, List<Product>> collect = groupProducts
                .stream()
                .collect(Collectors
                        .groupingBy(
                                (Product::getCategory)));

        System.out.println(collect);
    }
}
