import java.util.Scanner;
class Product2 {
    private String productid;
    private String productName;
    private float importPrice;
    private float exportPrice;
    private float profit;
    private int quantity;
    private String descriptions;
    private boolean status;


    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã sản phẩm (Pxxxx): ");
        this.productid = scanner.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        this.productName = scanner.nextLine();

        System.out.print("Nhập giá nhập: ");
        this.importPrice = scanner.nextFloat();

        System.out.print("Nhập giá xuất: ");
        this.exportPrice = scanner.nextFloat();

        System.out.print("Nhập số lượng sản phẩm: ");
        this.quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Nhập mô tả sản phẩm: ");
        this.descriptions = scanner.nextLine();

        System.out.print("Nhập trạng thái sản phẩm (true - Đang bán, false - Không bán): ");
        this.status = scanner.nextBoolean();
    }

    public void displayData() {
        System.out.println("Mã sản phẩm: " + productid);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá xuất: " + exportPrice);
        System.out.println("Lợi nhuận: " + profit);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Mô tả: " + descriptions);
        System.out.println("Trạng thái: " + (status ? "Đang bán" : "Không bán"));
    }

    public void calProfit() {
        this.profit = exportPrice - importPrice;
    }
}
public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product2[] arrProduct = new Product2[100];

        // Menu implementation goes here
        // You can implement the menu options as described in your prompt

        // Example usage:
        int choice;
        do {
            System.out.println("------------------------------MENU---------------------------------");
            System.out.println("1. Nhập thông tin n sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo giá");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm");
            System.out.println("10. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Input product data
                    break;
                case 2:
                    // Display product data
                    break;
                case 3:
                    // Calculate profit
                    break;
                // Other cases go here...
                case 10:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 10);
    }
}
