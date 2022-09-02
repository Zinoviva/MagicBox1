public class Main {
    public static void main(String[] args) throws RuntimeException {
        MagicBox <Integer> magicBox = new MagicBox<Integer>(3);
        magicBox.add(3);
        magicBox.add(2);
        magicBox.add(5);
        System.out.println("Выбранный метод" + " " + magicBox.pick());
    }
}
