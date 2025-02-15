package Map;

import java.lang.ref.WeakReference;

class Phone {
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
public class GCollection {
    public static void main(String[] args) {
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Samsung", "Samsung Galaxy S23 Ultra"));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        } catch (Exception ignored) {
        }
        System.out.println(phoneWeakReference.get());
    }
}
