package IfElse_SwitchCase_For;

public class DemoIfElse {
    // If else dùng để kiểm tra điều kiện và trả ra kết quả tương ứng
    // Mệnh đề if: if (condition) { // hành động nếu đúng }
    // Mệnh đề if-else: if (condition) { // hành động nếu đúng } else { // hành động nếu sai}
    // Mệnh đề if-else-if: if (condition) { // hành động nếu đúng } else if (condition) { // hành động ngược lại } ... else { }

    public static void main(String[] args) {
        int age = 20;
        String address = "Ha Noi";
        String header = "Login CMS Page";
        // So sánh bằng 1 chuỗi dùng hàm equals()
        // So sánh bằng 1 số dùng ==
        // So sánh chứa trong chuỗi dùng hàm contains()

        // Mệnh đề if
        if ((age == 18) && address.equals("Ha Noi")) {
            System.out.println("Được đi NVQS");
        }
        if (header.contains("Login")) {
            System.out.println("Đã đến được trang login");
        }

        // Mệnh đề if-else
        String gender = "Male";
        if (gender.equals("Male") || age < 30) {
            System.out.println("Đi cuốc đất");
        } else {
            System.out.println("Đi hái rau");
        }

        // Mệnh đề if-else-if
        double dtb = 7.5;
        if (dtb > 10 || dtb < 0) {
            System.out.println("Không hợp lệ");
        } else {
            if (dtb >= 8) {
                System.out.println("Giỏi");
            } else if (dtb < 8 && dtb >= 6.5) {
                System.out.println("Khá");
            } else if (dtb < 6.5 && dtb >= 3.5) {
                System.out.println("Trung Bình");
            } else {
                System.out.println("Ở lại lớp");
            }
        }
    }
}
