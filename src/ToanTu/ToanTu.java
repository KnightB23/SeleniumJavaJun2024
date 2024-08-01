package ToanTu;

public class ToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        double d, e, f; // Khai báo cả 3 biến trước
        d = e = f = 0; // Gán giá trị sau

        // Toán tử số học
        System.out.println("Kết quả a chia c lấy số dư = " + (a % c));
        System.out.println(a++); // Mới thực hiện phép tính a = a + 1 thôi chứ chưa có giá trị liền, lần sau gọi mới thấy được giá trị tăng
        System.out.println(a); // a = 11
        System.out.println(a += 5); // a = a + 5 = 16
        System.out.println(a + b * c / 10); // máy tính sẽ thực hiện nhân chia trước cộng trừ sau, nhưng mình nên chủ động đặt dấu () để phân biệt

        // Toán tử so sánh và logic
        System.out.println("So sánh a > b: " + (a > b)); // Phải để cụm tính toán vào cặp () để phân biệt với chuỗi
        System.out.println(a == b);
        System.out.println((a > b) && (b > c));
        System.out.println((a > b) || (b > c));
        System.out.println(((a < b) && (b > c)) || ((a > c) && (b < c))); // Ở đây kiểm tra phép toán & trước, rồi mới tới phép toán ||
    }
}
