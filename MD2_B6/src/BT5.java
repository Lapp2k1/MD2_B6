import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Product {
    private String productid;
    private String productName;
    private float price;
    private String description;
    private Date created;
    private String catalogName;
    private int productStatus;

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập mã sản phẩm (C/S/A): ");
        this.productid = scanner.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        this.productName = scanner.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        this.price = scanner.nextFloat();

        scanner.nextLine(); // Consume newline
        System.out.print("Nhập mô tả sản phẩm: ");
        this.description = scanner.nextLine();

        System.out.print("Nhập ngày nhập sản phẩm (dd/mm/yyyy): ");
        String dateString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.created = dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Ngày không hợp lệ. Sử dụng định dạng dd/mm/yyyy.");
        }

        System.out.print("Nhập tên danh mục: ");
        this.catalogName = scanner.nextLine();

        System.out.print("Nhập trạng thái sản phẩm (0: Đang bán, 1: Hết hàng, 2: Không bán): ");
        this.productStatus = scanner.nextInt();
    }

    public void displayData() {
        System.out.println("Mã sản phẩm: " + productid);
        System.out.println("Tên sản phẩm: " + productName);
        System.out.println("Giá sản phẩm: " + price);
        System.out.println("Mô tả sản phẩm: " + description);
        System.out.println("Ngày nhập sản phẩm: " + created);
        System.out.println("Danh mục sản phẩm: " + catalogName);
        System.out.println("Trạng thái sản phẩm: " + productStatus);
    }
}
public class BT5 {
    public static void main(String[] args) {
        Product product = new Product();
        product.inputData();
        System.out.println("\nThông tin sản phẩm:");
        product.displayData();
    }
}

