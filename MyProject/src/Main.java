public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("staff", "small", 14);
        System.out.println(dog);
        Dog dog2 = new Dog("staff", "small", 14, "curve", "straight");
        System.out.println(dog2);
        Animal animal = new Animal("dog", "small", 14);
        animal.makeNoise();
        dog.move("fast");
    }
}