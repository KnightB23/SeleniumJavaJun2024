package DemoCollections;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        // Khai báo dữ liệu Array List
        // Được phép lưu nhiều giá trị trùng lặp

        List<String> menu = new ArrayList<>(); // Khai báo list thì có thể khai báo nhiều kiểu thuộc list; vì list chứa nhiều kiểu khác nhau
        // ArrayList<String> menu2 = new ArrayList<>(); khai báo ArrayList thì vế sau không được chọn các kiểu khác
        // Phân biệt giữa Array và arrayList: Array giới hạn dữ liệu, không có hàm hỗ trợ
        // ArrayList không giới hạn dữ liệu; có hàm hỗ trợ
        // Array đơn giản hơn và ít tốn bộ nhớ; có ít dữ liệu

        // Thêm dữ liệu
        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Tasks");
        menu.add("Sales");
        menu.add("Customer");
        menu.add("Project");

        System.out.println("===============================");
        // Duyệt kiểu dữ liệu map
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i)); // duyệt từ đầu đến cuối
        } // Arraylist có chỉ mục, vì vậy nên dùng for cơ bản ở đây vì nó có hỗ trợ chỉ mục
        // Không nên dùng for cải tiến vì nó không hỗ trợ chỉ mục, mà phải khai báo thêm 1 biến chỉ mục j để hỗ trợ

        int j = 0;
        for (String value : menu) {
            System.out.println(menu.get(j));
            j++;
        }
        System.out.println("===============================");

        // Xóa dữ liệu
        menu.remove(3);

        // Update value: muốn cập nhật thì phải xóa rồi add lại; chứ k hỗ trợ update trực tiếp vì nó có chỉ mục
        menu.add(3, "Project 2");
        menu.set(1, "abbb");

        // Get giá trị theo chỉ mục
        System.out.println(menu.get(3));
        System.out.println(menu.get(1));

        // Kiểm tra dữ liệu
        System.out.println(menu.contains("Dashboard"));
        // https://anhtester.com/lesson/java-for-tester-xu-ly-chuoi-string-trong-java
        // https://chatgpt.com/share/f1bc225d-8b2e-4ef3-a08b-a2b593f34dc5
    }
}
