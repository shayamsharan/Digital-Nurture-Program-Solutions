
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private String category;
    private double price;

    // Constructor
    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name.toLowerCase(); // for case-insensitive search
        this.category = category.toLowerCase();
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    // toString() to display product info
    @Override
    public String toString() {
        return "Product{" +
               "ID=" + id +
               ", Name='" + name + '\'' +
               ", Category='" + category + '\'' +
               ", Price=$" + price +
               '}';
    }
}

public class EcommerceSearch {

    // Function to search products by keyword
    public static List<Product> searchProducts(List<Product> catalog, String keyword) {
        List<Product> results = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (Product product : catalog) {
            if (product.getName().contains(keyword) || product.getCategory().contains(keyword)) {
                results.add(product);
            }
        }

        return results;
    }

    public static void main(String[] args) {
        // Sample product catalog
        List<Product> catalog = new ArrayList<>();
        catalog.add(new Product(1, "iPhone 14", "Electronics", 999.99));
        catalog.add(new Product(2, "Samsung Galaxy S22", "Electronics", 899.99));
        catalog.add(new Product(3, "Nike Running Shoes", "Footwear", 149.99));
        catalog.add(new Product(4, "Levi's Jeans", "Clothing", 59.99));
        catalog.add(new Product(5, "Sony Headphones", "Electronics", 199.99));

        // User input for search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine();

        // Perform search
        List<Product> searchResults = searchProducts(catalog, keyword);

        // Display results
        if (searchResults.isEmpty()) {
            System.out.println("No products found matching: " + keyword);
        } else {
            System.out.println("Search Results:");
            for (Product p : searchResults) {
                System.out.println(p);
            }
        }

        scanner.close();
    }
}
