public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Animals[] animals = new Animals[3];
         animals[0] = new Cat("Маркиз", "Корм", "Владимир", "пирсидская ");

         animals[1] = new Horse("Спирит", "Ковров", "Сено", "две");

         animals[2] = new Dog("Бобик", "Владимир", "корм", "Дворняга");
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeNoise();
            doctor.treatAnimal(animals[i]);
            System.out.println();

        }

    }
}
