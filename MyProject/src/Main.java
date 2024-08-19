public class Main {
    public static void main(String[] args) {
        Dog dogOne =new Dog("Hasky",25);
        Dog dogTwo = new Dog("Staff",17,"curve","twisted");
        Animal animal = new Animal("doberman","big",30);

        dogOne.makeNoise();
        dogOne.move("fast");
        dogTwo.move("slow");
        animal.makeNoise();
    }
}