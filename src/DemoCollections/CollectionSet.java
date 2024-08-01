package DemoCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
    /*
    Collection là bộ khuôn khổ cung cấp kiến trúc có sẵn bao gồm nhiều kiểu dữ liệu interface (Set, List, Queue, Deque,...)
    và các lớp (DemoArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet...)
    => Để hỗ trợ lưu trữ và thao tác tới nhóm đối tượng
    Khi gọi dùng thì gọi dùng các class (màu xanh)
    Cần import class trước khi sử dụng
    Cần học set (HastSet), list (DemoArrayList), map (HastMap, HastTable)
    Set là một collection không thể chứa 2 giá trị trùng lặp; nếu trùng lặp thì lấy dữ liệu sau cùng
    List là một collection có thứ tự, có thể chứa các phần tử trùng lặp
    Map là đối tượng ánh xạ mỗi key tương ứng với 1 giá trị, không thể chứa key trùng lặp (nếu trùng chỉ hiểu tới key cuối cùng)
    mỗi key ánh xạ chỉ 1 giá trị
    VD: { "name" => "Test Automation", "browser"=> "Chrome" }
    */
    public static void main(String[] args) {
        Set<String> menu = new HashSet<>(); // Set = tên collection; menu = tên của set; HashSet: kiểu set
        menu.add("Project");
        menu.add("ACC");
        menu.add("Tasks");
        menu.add("Sales");

        System.out.println("Các phần tử của set: " + menu); // in nguyên cục string
        System.out.println(menu.contains("Tasks"));
        System.out.println(menu.remove("ACC"));
        System.out.println(menu.size());
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) { // iterator để duyệt; hasNext: để kiểm tra có phần tử kế tiếp không; nếu còn thì lấy giá trị kế tiếp
            System.out.print(itr.next() + ", "); // in và cách nhau khoảng trắng giữa các giá trị
        } // iterator sẽ check nếu có kế tiếp thì chạy code; còn không thì ngưng duyệt;
        System.out.println("\n================");
        for (String obj : menu) {
            System.out.println(obj);
        } // set không có vị trí, chỉ mục
        // Iterator: class hỗ trợ duyệt dữ liệu collection
        // Hoặc dùng For each (for cải tiến)
    }
}
