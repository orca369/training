
public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }



    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" :(weight<35 ? "medium" : "big"),weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }
//    we need to keep the super if the first constructor empty and then we can pass the arguments in the second constructor

    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();  /* this super is different from the super in the parentheses it's a lot of look like THIS it allows us to access the super in toString method */
    }

    public  void makeNoise(){

    }
    public  void move(String speed){
        super.move(speed);
        System.out.println("Dogs walk run and wag their tail");
    }
}
