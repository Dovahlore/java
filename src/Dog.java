public class Dog {
    private String name;
    private int age;
    private double weight;
    private static boolean isHungry;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 150.0;
        this.isHungry = true;
    }

    public void bark() {
        System.out.printf("Woof!I am %s and I am %d years old,weighing %f pounds.%n", this.name, this.age, this.weight);
    }
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", 3);
        myDog.bark();
        myDog.isHungry = false;

        System.out.println(myDog.isHungry);
    }

}
