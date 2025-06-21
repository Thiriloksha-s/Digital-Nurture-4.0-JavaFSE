import java.util.*;
class Product {
    int id;
    String name;
    String category;
    Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
    public String toString() {
        return id + " - " + name + " -> " + category ;
    }
}

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, String target) {
        for (Product product : products) {
            if (product.name.equalsIgnoreCase(target)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String target) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].name.compareToIgnoreCase(target);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Chair", "Furniture"),
            new Product(3, "Pen", "Stationery"),
            new Product(4, "Phone", "Electronics"),
            new Product(5, "Book", "Stationery")
        };
        java.util.Arrays.sort(products, (a, b) -> a.name.compareToIgnoreCase(b.name));

        Product res1 = linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + (res1 != null ? res1 : "Not Found"));

        Product res2 = binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + (res2 != null ? res2 : "Not Found"));
    }
}
