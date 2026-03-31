import java.util.Scanner;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManagement crud = new InventoryManagement();

        int option;

        do {
            System.out.println("""
                    ====Menu Teste====
                    1 - Adicionar
                    2 - Buscar
                    3 - Atualizar
                    4 - Excluir
                    5 - Listar
                    0 - Sair
                    ===================
                    Escolha uma opção:
                    """);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    String name = InputUtils.readString(scanner, "Nome:");
                    String category = InputUtils.readString(scanner, "Categoria:");
                    String description = InputUtils.readString(scanner, "Descrição:");

                    int quantity = InputUtils.readInt(scanner, "Quantidade:");
                    double salePrice = InputUtils.readDouble(scanner, "Preço de venda:");
                    double costPrice = InputUtils.readDouble(scanner, "Preço de custo:");

                    String url = InputUtils.readString(scanner, "URL da imagem:");

                    Product product = new Product(
                            name,
                            description,
                            category,
                            salePrice,
                            costPrice,
                            quantity,
                            url
                    );

                    crud.addProduct(product);
                    break;

                case 2:
                    System.out.println("Buscar: ");
                    String searchInput = scanner.nextLine();
                    crud.search(searchInput);
                    break;

                case 3:

                    break;
                case 4:
                    System.out.println("Digite o ID do produto: ");
                    String idInput = scanner.nextLine();
                    try {
                        UUID id = UUID.fromString(idInput);

                        boolean removed = crud.deleteProduct(id);

                        if (removed) {
                            System.out.println("Removido com sucesso!");
                        } else {
                            System.out.println("Produto não encontrado");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("ID inválido!");
                    }
                case 0:
                    System.out.println("Encerrando Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (option != 0);

        scanner.close();
    }
}