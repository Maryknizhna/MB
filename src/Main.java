public class Main {
    public static void main(String[] args) {
        MagicBox<String> box = new MagicBox<>(6);
        box.add("1");
        box.add("2");
        box.add("3");
        box.add("4");
        box.add("5");
        box.add("6");
        System.out.println(box.pick());
    }
}