public class BT2 {
    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Hello, World!");

        sbf.append(" Welcome to Java!");
        System.out.println("Chuỗi sau khi nối: " + sbf);

        sbf.insert(7, " NgocSora");
        System.out.println("Chuỗi sau khi chèn: " + sbf);

        sbf.replace(0, 5, "Hi");
        System.out.println("Chuỗi sau khi thay thế: " + sbf);

        sbf.delete(11, 18);
        System.out.println("Chuỗi sau khi xóa: " + sbf);

        System.out.println("Độ dài của chuỗi: " + sbf.length());

        sbf.reverse();
        System.out.println("Chuỗi sau khi đảo ngược: " + sbf);
    }
}
