public class ReviewExercices {
    public static void main(String[] args) {
        /* Sửa tên 1 package, folder, biến, hàm, class thì phải click chuột phải, rồi refactor, rename
        để Intellij sửa hết các chỗ liên quan */
        /* B1:
        x Đối tượng class đúng chuẩn có thể gọi các biến toàn cục không phải static và hàm không thuộc main; không gọi được biến trong hàm
        x Khi gọi biến/hàm không phải static vào trong hàm static => phải khởi tạo đối tượng class
        x Nếu biến/hàm static gọi trong hàm static => không cần khởi tạo đối tượng class; mà có thể gọi trực tiếp
        Nên set các biến toàn cục dùng chung có tên toàn chữ in để phân biệt với biến của class khác
        Cách gọi đúng chuẩn 1 biến toàn cục static/hàm static từ 1 class khác:
        + Lấy tên class chấm thẳng tên biến hoặc chấm tên hàm luôn
        + Cách gọi thông qua đối tượng class vẫn work nhưng không đúng chuẩn
        ví dụ có biến static BROWSER trong class webUI, có thể gọi bằng cách webUI.BROWSER
        Còn nếu biến không phải static, thì phải khởi tạo đối tượng class rồi mới gọi biến thông qua đối tượng class
        B2: Nếu có 1 biến trong hàm, thì nó chỉ mang giá trị khi hàm được gọi
        Nếu gọi trực tiếp biến của hàm đó, thì sẽ lấy giá trị default của data type của biến
        Khởi tạo đối tượng class để gọi các biến hoặc hàm trong class đó
        Để gọi class thì phải lấy đối tượng class chấm tên biến hoặc gọi biến trực tiếp; không thể lấy hàm chấm tên biến
        B4: Mảng sẽ bị giới hạn độ dài; để thêm giá trị vào mảng thì phải thêm chỉ mục
        \t = tab
        \n = xuống dòng
        Array list: thêm vào bao nhiêu hiểu bấy nhiêu; không cần phải define độ dài mảng (Array)
        hàm trả về có thể trả về đối tượng, kiểu dữ liệu
        Đối tượng biến trung gian để nhận các data trả về từ hàm
        Không thể lấy giá trị return trực tiếp của hàm được; phải gọi thông qua hàm
        ArrayList<String> employee = new ArrayList(); // 2 vế trước và sau dấu "=" phải bằng nhau và đều trả về 1 arrayList
        Từ format trên thì có thể khai báo đối tượng bằng 1 hàm có tham số trả về cùng kiểu dữ liệu với đối tượng:
        vd: ArrayList<String> employee = addEmployee(a:a;b:b)
        Add luôn giá trị trong array list khi khởi tạo nếu ít giá trị:  = newArrayList<>(Arrays.asList)...

        */

    }

}
