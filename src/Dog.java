public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println( String.format("Woof!I am %s and I am %d years old.", this.name, this.age));
    }
}
