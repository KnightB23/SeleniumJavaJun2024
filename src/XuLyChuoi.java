public class XuLyChuoi {
    public static void main(String[] args) {

        String s1 = "Lorem ipsum dolor sit amet";
        String s2 = "Nunc scelerisque viverra mauris in aliqua";

        // Chuỗi bắt đầu từ 0 và tính khoảng trắng là 1 kí tự
        // Cắt chuỗi
        System.out.println(s1.substring(10));
        System.out.println(s2.substring(3,6)); // Cắt từ kí tự 3 đến kí tự 6

        // Ghép chuỗi
        System.out.println(s1 + " " + s2);
        System.out.println("Nối chuỗi cách 2: " + s1.concat("abb"));

        // Chuyển kiểu in hoa thường
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        // Xóa kí tự khoảng trắng 2 đầu
        String s3 = " Test Automation ";
        System.out.println(s3.trim());

        // Độ dài chuỗi
        System.out.println("Độ dài chuỗi: " + s2.length()); // Đếm luôn khoảng trắng

        // Tìm kiếm kí tự
        System.out.println(s1.charAt(10));
        System.out.println(s1.indexOf("m"));

        // So sánh chuỗi
        // So sánh bằng
        String s4 = "Test Automation";
        System.out.println(s3.equals(s4));

        // So sánh chứa
        System.out.println(s4.contains("Automation"));

        // So sánh chuỗi mà bỏ qua in hoa thường
        String s5 = "Test automation";
        System.out.println("So sánh " + s4 + " và " + s5 + ": " + s4.equals(s5));
        System.out.println("So sánh " + s4 + " và " + s5 + " bỏ qua in hoa thường: " + s4.equalsIgnoreCase(s5));
    }
}
