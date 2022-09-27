public class Dog extends Animals {
    String name;
    String rod;

    public Dog(String name, String location, String food, String rod) {
        super(food, location, name);
        this.name = name;
        this.rod = rod;
    }

    @Override
    public void eat() {
        System.out.println("собака ест");
    }

    @Override
    public void makeNoise() {
        System.out.println("гав");
    }

}