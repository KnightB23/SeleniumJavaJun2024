package IfElse_SwitchCase_For;

public class DemoSwitchCase {
    // Switch Case dùng để thực thi 1 hoặc nhiều code từ điều kiện đầu vào
    public static void main(String[] args) {
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
        String browser = "Chrome";
        // Hàm toLowerCase() dùng chuyển chuỗi về chữ thường
        // Hàm toUpperCase() dùng chuyển chuỗi về chữ in hoa
        // Hàm .trim() dùng để remove khoảng trắng 2 đầu
        switch (browser.toLowerCase().trim()) { // lowercase giá trị đầu vào + remove khoảng trắng
            case "chrome":
                System.out.println("Chạy test với trình duyệt Chrome");
                break;
            case "firefox":
                System.out.println("Chạy test với trình duyệt Firefox");
            case "edge":
                System.out.println("Chạy test với trình duyệt Edge");
            default:
                System.out.println("Chạy test với trình duyệt Chrome mặc định");
                break; // nên thêm break ở trường hợp default
        }
        // nếu đã thỏa 1 case mà không break ở điều kiện đó, thì sẽ không kiểm tra điều kiện các case khác nữa và nó sẽ đi qua hết các code tới default luôn
        // nếu chưa thỏa 1 case thì vẫn sẽ đi hết các case để kiểm tra điều kiện
        // bản chất của ngôn ngữ lập trình hoa thường thì ở đây cũng sẽ phân biệt hoa thường
    }


}