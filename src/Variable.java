public class Variable { // khai báo class tên là "Variable"
    String address = "Hồ Chí Minh"; // đây là biến toàn cục
    static String phone = "0123456789"; // đây là biến tĩnh (có từ khóa static)

    public void sayHello() {
        int n = 10; // đây là biến cục bộ
        System.out.println("Gia tri cua n la: " + n); // nếu dùng variable
        System.out.println(address);
        System.out.println(phone);
    }
    public static void main(String[] args) {
        /* note */
        Variable address = new Variable();
        System.out.println(address.address);
        System.out.println(address); // k in ra được biến instance address
        System.out.println("Phone: " + Variable.phone);
        int number1 = 2501;
        int number2 = 123;
        String name = "Binh"; // Java lưu chuỗi trong dấu nháy kép thay vì dấu nháy đơn
        System.out.println(number1 + " x changiuoi");
    }
}

