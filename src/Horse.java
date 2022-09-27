public class Horse extends Animals {
    String name;
    String podkova;

    public Horse(String name, String location, String food, String podkova) {
        super(food, location, name);
        this.name = name;
        this.podkova = podkova;
    }

    @Override
    public void eat() {
        System.out.println("лошадь ест");
    }

    @Override
    public void makeNoise() {
        System.out.println("бр");
    }
}