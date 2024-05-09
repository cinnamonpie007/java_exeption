public class Main {


    public static void main(String[] args) {

        AddToys toys = new AddToys();

        Toy toy1 = new Toy(1, "Doll", 1, 20);
        Toy toy2 = new Toy(2, "Car", 1, 20);
        Toy toy3 = new Toy(4, "Boll", 1, 40);

        toys.addToys(toy1);
        toys.addToys(toy2);
        toys.addToys(toy3);

        PrizeToy getToy = new PrizeToy(toys);

        System.out.println(toys.getToysArray());

        toys.changeProcent(1, 40);

        System.out.println(toys.getToysArray());
    }
}
