package Array_Collection_Lesson5_11Jul2024;

public class Array {
    /*
    Mảng gồm tập hợp các phần tử có cùng kiểu dữ liệu và được lưu trữ theo thứ tự trong bộ nhớ
    Mảng bắt đầu từ vị trí thứ 0;
    VD: String An = "An";
    String Linh = "Linh";
    int number = 10;

    String studentName[] = { "An", "Binh", "Linh" };
    int age[] = { 20, 25, 30, 35 };
    Mảng 1 chiều và mảng 2 chiều;
    Mảng 1 chiều chỉ là một đường ngang; chỉ cần chỉ định vị trí thứ mấy thôi;
    Mảng 2 chiều thì giống như Excel: cần phải biết phần tử đó ở cột và dòng nào
    Có 3 cách khai báo mảng:
    dataType[] arr; // arr = tên mảng
    dataType []arr;
    dataType arr[];
    */

    // arrayName.lenght để lấy độ dài của mảng
    public static void main(String[] args) {
        // Cách khai báo mảng 2 - Khởi tạo mảng trước và khai báo giá trị sau
        int number1[] = new int[4]; // 4 = số phần tử
        number1[0] = 10;
        number1[1] = 20;
        number1[2] = 30;
        number1[3] = 40;
        System.out.println("Độ dài mảng = " + number1.length);
        for (int i = 0; i < number1.length; i++) { // Vị trí của mảng bắt đầu = 0 nên chạy từ i = 0, linh động hơn nếu muốn duyệt số lượng nhiều
            System.out.println("Number at index " + i + " : "+ number1[i]); // number[i] để truy xuất giá trị thứ i của mảng
        }
        System.out.println("Phần tử ở chỉ mục 3 của mảng là: " + number1[3]);

        // Cách khai báo mảng 2 - Khởi tạo và gán giá trị
        int number2[] = {1, 2, 3, 4, 5};
        number2[2] = 6; // Cập nhật lại giá trị của phần tử thứ 3 hoặc chỉ mục thứ 2

        System.out.println("Kích cỡ mảng: " + number2.length);
        System.out.println("===============================");
        for (int i : number2) {
            System.out.println(i);
        }
    // Dùng mảng để truy xuất data trong test auto

    }
}

