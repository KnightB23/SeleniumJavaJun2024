public class DataType02Jul24 {
    /*quy ước cách đặt tên của nhiều người trong ngôn ngữ Java:
    tên biến: camel case, vd: numberShort
    tên hàm: chữ cái đầu viết hoa, vd: DataType...
     */
    public static void main(String[] args) {
        String changiuoi = "Fabulous"; /* string sẽ có giới hạn, nhưng giới hạn của nó lớn, giá trị mặc định là rỗng
        vd String name = ""; giá trị rỗng vẫn chiếm vùng nhớ
        String abc = null; => không chiếm vùng nhớ nào; có thể lưu được dấu
        => Có thể lưu gần như tất cả data type
        */
        char a = 'a'; // lưu từ 0 -> 9 và a -> z; k lưu được dấu, nếu có dấu thì được hiểu là 2 kí tự
        boolean isNull = true; // chỉ gán được 2 giá trị true hoặc false; mặc định sẽ là false => dùng để kiểm tra tính đúng sai
        // byte, short, int, long cùng chứa kiểu dữ liệu số nguyên
        // bit là đơn vị nhỏ nhất máy tính xử lý, byte = 8 bit
        byte Byte; // lưu kiểu số nguyên từ -128 đến 127, mặc định là 0
        short numberShort = 1;
        int productTotal = 2501; // lưu kiểu số nguyên có kích thước đến 4 byte, từ -2,147,483,648 đến 2,147,483,647. Giá trị mặc định là 0. Hay dùng trong test
        long numberLong = 12548793333L; // lưu kiểu số nguyên có kích thước đến 8 byte. Hay dùng trong test. Giá trị mặc định là 0L. Khai báo giá trị phải ghi thêm chữ L
        // float và double để lưu số thực
        float n2 = 1.11F; // lưu số thực có kích thước đến 4 byte, giá trị mặc định là 0.0F. Khai báo giá trị phải ghi thêm chữ F
        double n3 = 1.11D; // lưu số thực có kích thước đến 8 byte, giá trị mặc định là 0.00D. Khai báo giá trị phải ghi thêm chữ D
        // Kiểu dữ liệu đối tượng: Lesson5_11Jul2024.Array, Class, Interface
    }
}
