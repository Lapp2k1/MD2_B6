public class BT1 {
    public static void main(String[] args) {

        String myString = "Welcome to Java!";

        System.out.println("Chuỗi ban đầu: " + myString);
        System.out.println("Độ dài của chuỗi: " + myString.length());
        System.out.println("Chuỗi có rỗng không? " + myString.isEmpty());
        System.out.println("Chuỗi sau khi loại bỏ khoảng trắng: " + myString.trim());
        System.out.println("Chuỗi viết hoa: " + myString.toUpperCase());
        System.out.println("Chuỗi viết thường: " + myString.toLowerCase());
        System.out.println("Chuỗi có chứa từ \"Java\" không? " + myString.contains("Java"));
        System.out.println("Chuỗi sau khi thay thế \"Welcome\" bằng \"Hello\": " + myString.replace("Welcome", "Hello"));

        String[] words = myString.split(" ");
        System.out.print("Mảng từ trong chuỗi: ");
        for (String word : words) {
            System.out.print(word + " ");

        }
        System.out.println();
    }
}
