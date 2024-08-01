package DemoCollections;
import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    public static void main(String[] args) {
        /* Khai báo dữ liệu Map; Map để lưu những giá trị config data
        khi nào cần giá trị thì truy xuất qua key */

        // Không lưu được 2 key trùng lặp
        Map<String, String> map1 = new HashMap<>();
        Map<Integer, Double> map2 = new HashMap<>();

        // Thêm dữ liệu
        map1.put("language", "Java"); // language là key, Java là value
        map1.put("framework", "TestNG");
        map1.put("library", "Selenium");

        map2.put(1, 1110.1);
        map2.put(2, 210.1);
        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);

        System.out.println(map1.containsKey("language"));
        System.out.println(map1.containsValue("C++"));
        // map1.remove("library");

        // Update value
        map1.put("library", "Playwright");

        // Duyệt kiểu dữ liệu map
        // Get hết giá trị của key và value
        for (Map.Entry<String, String> entry: map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<Integer, Double> entry: map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // coi lại bài class webUI;
        // coi lại for; array;
        // coi lại map, set;
        // viết code cho postman, hoặc trong Java;
    }
}
