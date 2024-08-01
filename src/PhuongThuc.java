public class PhuongThuc {

    public double sum;
    public double res;

    // Hàm không trả về kq (void) và không tham số
    public void cong2So() {
        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println("a + b = " + sum);
    }

    // Hàm không trả về kq (void) và có tham số
    public void cong2So(int number1, int number2) {
        System.out.println("Kết quả hàm cong2So = " + (number1 + number2));
    }

    // Hàm có trả về kết quả và không tham số
    public double nhan2So() {
        int a = 5;
        int b = 10;
        res = a * b;
        // System.out.println("res = " + res); (nếu muốn in thì in, thì khi gọi thẳng thì nó sẽ in ra màn hình)
        return res;
    }

    // Hàm trả về kết quả có tham số
    public long nhan3So(int number1, int number2, int number3) {
        return number1 * number2 * number3; // nên cast kết quả vào long data type để có thẻ
    }

    public static void main(String[] args) {
        // k thể gọi trực tiếp hàm, biến không phải static vào hàm static;
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2So();
        // cách 2 để in biến trong hàm void: b1: gọi hàm trước như dòng 36, b2: in biến: System.out.println(phuongThuc.sum);
        //cong2so(); //không thể gọi trực tiếp hàm non-static vào
        phuongThuc.nhan2So();
        phuongThuc.cong2So(50, 20);
        phuongThuc.cong2So(30, 20);
        phuongThuc.nhan2So(); //vì trong hàm không có hàm println nên không in ra được
        phuongThuc.nhan3So(10, 1, 2); //Khi gọi 1 hàm là đã chạy code ở bên trong rồi, nhưng trong hàm này không có println nên k in ra màn hình dược
        //System.out.println(phuongThuc.cong2So());
        System.out.println("Kq hàm nhan2So không tham số: " + phuongThuc.nhan2So());
        System.out.println("Kq hàm nhan3So có tham số: " + (phuongThuc.nhan3So(10, 30, 2) / 5));
    }
    //hàm void không để vào println được, vì hàm void không trả giá trị;
}
