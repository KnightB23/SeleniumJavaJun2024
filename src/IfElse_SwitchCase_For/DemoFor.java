package IfElse_SwitchCase_For;

public class DemoFor {
    // Vòng lặp For dùng để lặp lại 1 đoạn code theo số lần hoặc điều kiện mình chỉ định
    // 3 kiểu: Vòng lặp for đơn giản; Vòng lặp for cải tiến; Vòng lặp for gán nhãn
    public static void main(String[] args) {
        // Vòng lặp For đơn giản
        // Cú pháp: for (khoi_tao_bien ; check_dieu_kien ; tang/giam_bien) { code }
        // khoi_tao_bien = khởi tạo giá trị biến ban đầu; check_dieu_kien: điều kiện để ngưng vòng lặp; tang/giam_bien: mỗi lần lặp thì tăng bao nhiêu đơn vị
        
        for (int i = 0; i <= 10; i += 2) { // i++ có nghĩa là i = i + 1 (mỗi lần chạy tăng 1 đơn vị/1 bước nhảy)
            // i += 2 tức là i = i + 2
            System.out.println("Xin chào " + i);
        }
        for (int i = 0; i <= 14; i++) { // i++ có nghĩa là i = i + 1 (mỗi lần chạy tăng 1 đơn vị/1 bước nhảy)
            // if (menu.get(i).equals("Dashboard")) {
            System.out.println("Đến được trang dashboard");
            //    break; // Dùng để thoát khỏi vòng lặp for, nếu đã thỏa điều kiện rồi, thì dùng break để ngưng không chạy vòng lặp nữa; phải có điều kiện trong vòng lặp for thì mới add thêm break
            //    nếu không có điều kiện thì for không nên thêm break
        }
        // Vòng lặp For cải tiến để lặp chỉ cho mảng hoặc collection, vẫn có thể dùng vòng lặp for bình tường nhưng sẽ hơi rườm rà
        // Cú pháp: for (dataType variable : arrayName) { code }
        // Vòng lặp For tạo 1 biến tạm và duyệt tuần tự từ đầu đến cuối
        int arr[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        for (int i : arr) {
            System.out.println(i);
        }
        String dataCustomerName[] = {"Hoa", "Hồng", "Huệ"};
        // Test lại phần này
        for (int i = 0; i < (dataCustomerName.length); i++) {
            if (dataCustomerName[i].equals("Bình")) {
                System.out.println("Tìm thấy Bình");
                break;
            } else {
                System.out.println("Không có Bình");
            }
        }
    }
}

