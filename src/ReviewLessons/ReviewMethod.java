package ReviewLessons;

public class ReviewMethod {

    public double div;
    public double remainder;

    // Hàm không trả về kq và không tham số
    private void chia2So() {
        int a = 10;
        int b = 20;
        div = (double) a / b;
        System.out.println("10 / 20 = " + div);
    }

    // Hàm không trả về kq và có tham số
    public void chia2So(int number1, int number2) {
        System.out.println("1Kết quả hàm chia2So của " + number1 + " và " + number2 + " = " + (number1 / number2));
        System.out.printf("Kết quả hàm chia2So của %d và %d = %d%n", number1, number2, number1 / number2); // Cách nâng cao nếu muốn in string có biến tham số
    }
    public void complimentMessage(String name) {
        System.out.println(name + " is fabulous");
    }

    // Hàm trả về kết quả và không tham số
    protected double laySoDu2So() {
        int a = 10;
        int b = 8;
        remainder = a % b;
        return remainder;
    }

    // Hàm trả về kết quả và có tham số
    public double laySoDu2So(int number1, int number2) {
        remainder = number1 % number2;
        System.out.println("Kết quả hàm laySoDu2So: " + remainder);
        System.out.printf("Kết quả hàm laySoDu2So của %d và %d = %d%n", number1, number2, number1 % number2);
        return (double) number1 / number2;
    }

    public static void main(String[] args) {
        // Không thể gọi trực tiếp hàm, biến không phải static vào hàm static;
        ReviewMethod phuongThuc = new ReviewMethod();
        phuongThuc.complimentMessage("changiuoi");
        phuongThuc.chia2So();
        phuongThuc.chia2So(16, 5);
        phuongThuc.laySoDu2So(); // Khi gọi thì sẽ chạy hết tất cả các code trong hàm, nhưng ở đây k in ra kết quả vì nội tại hàm không có in, phải dùng thêm hàm in bên dưới
        System.out.println("In hàm trả về giá trị: " + phuongThuc.laySoDu2So());
        phuongThuc.laySoDu2So(12,5); // Nội tại hàm có in nên chấm gọi trực tiếp vẫn show ra màn hình được
    }
    // Nếu bản thân nội tại hàm đã có println; thì khi chấm gọi ở hàm main sẽ in ra màn hình được
    // Nhưng nếu bản thân hàm không có println; thì chỉ dùng được hàm println cho hàm có kết quả trả về; không dùng cho hàm void được, vì hàm void không trả kết quả;
}
