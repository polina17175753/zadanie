public class Cat extends Animals{
    String poroda;
    String name;
    public Cat (String name,String food, String location, String poroda){
        super(food, location, name);
        this.poroda =poroda;
        this.name = name;
    }
    @Override
    public void makeNoise(){
        System.out.println("мяу");

    }
    @Override
    public void eat(){
        System.out.println("кот ест");

    }
}
