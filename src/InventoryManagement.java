import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class InventoryManagement {

    Scanner scanner = new Scanner(System.in);
    private ArrayList<Product> stock = new ArrayList<>();

    /// Create
    public void addProduct(Product product) {
        stock.add(product);
    }

    /// List
    public void listProduct() {
        if (stock.isEmpty()) {
            System.out.println("\nNenhum produto cadastrado!\n");
            return;
        }

        for (Product p : stock) {
            p.printProduct();
            System.out.println("\n=======\n");
        }
    }

    /// Search
    public ArrayList<Product> search(String searchValue) {
        ArrayList<Product> result = new ArrayList<>();

        for (Product item : stock) {

            boolean match = false;

            if (item.getNameProduct().toUpperCase().contains(searchValue.toUpperCase())) {
                match = true;
            }

            if (item.getCategory().toUpperCase().contains(searchValue.toUpperCase())) {
                match = true;
            }

            if (item.getId().toString().equals(searchValue)) {
                match = true;
            }

            if (match == true) {
                result.add(item);
            }
        }

        if (result.isEmpty()) {
            System.out.println("Produto não encontrado");
        } else {
            for (Product item : result) {
                item.printProduct();
            }
        }

        return result;
    }



    /// Update
    public void updateProduct(Product p, String newName, String newCategory, String newDescription, Double newSalePrice, Double newCostPrice, int newQuantity,  String newUrlImage){
        p.setNameProduct(newName);
        p.setCategory(newCategory);
        p.setDescription(newDescription);
        p.setSalePrice(newSalePrice);
        p.setCostPrice(newCostPrice);
        p.setQuantity(newQuantity);
        p.setUrlImage(newUrlImage);
    }

    public void updateNameProduct(Product p, String newName){
        p.setNameProduct(newName);
    }

    public void updateCategoria(Product p, String newCategory){
        p.setCategory(newCategory);
    }

    public void updateDescription(Product p, String newDescription){
        p.setDescription(newDescription);
    }

    public void updateSalePrice(Product p, Double newSalePrice){
        p.setSalePrice(newSalePrice);
    }

    public void updateCostPrice(Product p, Double newCostPrice){
        p.setCostPrice(newCostPrice);
    }

    public void updateQuantity(Product p, int newQuantity){
        p.setQuantity(newQuantity);
    }

    public void updateUrlImage(Product p, String newUrlImage){
        p.setUrlImage(newUrlImage);
    }
    /// Delete
    public boolean deleteProduct(UUID id) {

        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).getId().equals(id)) {
                stock.remove(i);
                return true;
            }
        }

        return false;
    }
}