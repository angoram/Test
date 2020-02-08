public class Driver implements SampleInterface {

    public static void main(String[] args) {
        System.out.println("Hello world from desktop.");
        SampleInterface.method();
    }

    @Override
    public void method2() {
        System.out.println("Overridden method");
    }
}
