import java.util.UUID;

public class Product {

    private UUID id;
    private String nameProduct;
    private String description;
    private String category;
    private double salePrice;
    private double costPrice;
    private int quantity;
    private String urlImage;

    /// construct
    public Product(String nameProduct, String description, String category, double salePrice, double costPrice, int quantity, String urlImage) {
        this.id = UUID.randomUUID();
        this.nameProduct = nameProduct;
        this.description = description;
        this.category = category;
        this.salePrice = salePrice;
        this.costPrice = costPrice;
        this.quantity = quantity;
        this.urlImage = urlImage;
    }

    /// getters
    public UUID getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void printProduct() {

        System.out.printf("""
                %s
                Produto: %s
                Categoria: %s
                Descrição: %s
                Preço de Venda: %.2f
                Preço de Custo: %.2f
                Quantidade: %d
                """, getUrlImage(), getNameProduct(), getCategory(), getDescription(), getSalePrice(), getCostPrice(), getQuantity());
    }

    /// setters
    public void setNameProduct(String newNameProcuct) {
        this.nameProduct = newNameProcuct;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void setSalePrice(double newProductPrice) {
        this.salePrice = newProductPrice;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public void setCostPrice(double newCostPrice) {
        this.costPrice = newCostPrice;
    }

    public void setUrlImage(String newUrlImage) {
        this.urlImage = newUrlImage;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    /// Modificar - Para botão de menos e mais
    public void setIncreaseQuantityOne() {
        this.quantity++;
    }

    public void setDecreaseQuantityOne() {
        this.quantity--;
    }

    /// Modificar - Para venda manual simples
    public void setIncreaseQuantity(int newQuantity) {
        this.quantity += newQuantity;
    }

}
