public class Test {
    public int a;
    public int c;
    public void getInfo() {
        int a = 1;
        int c = a;
        int b = 2;
    }

    public static void main(String[] args) {
        Test bienLocal = new Test();
        bienLocal.getInfo();
        System.out.println(bienLocal.c);
    }
}
