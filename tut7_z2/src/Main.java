public class Main {
    public static void main(String[] args) {

        Cat mruczek = new Cat("Mruczek");
        System.out.println(mruczek.getName());
        mruczek.start();
        System.out.println(mruczek.getType());
        mruczek.stop();
    }
}