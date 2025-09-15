public class TreeTest {
    public static void main(String[] args) {
        Tree t = new Tree();
        for (int i = 0; i < 5; i++) {
            t.insert(6);
        }
        for (int i = 0; i < 2; i++) {
            t.insert(10);
        }
        System.out.println(t.size());
    }
}
