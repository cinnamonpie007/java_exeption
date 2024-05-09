import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.io.FileWriter;


class PrizeToy {

    AddToys getAddToys;

    public PrizeToy(AddToys addToys) {
        this.getAddToys = addToys;
        chooseToy();
    }


    private void chooseToy() {
        double totalFrequency = getAddToys.getSysArray().stream().mapToDouble(Toy::getProcentWinnings).sum();
        Random random = new Random();
        double randomNumber = random.nextDouble() * totalFrequency;

        double sum = 0;
        for (Toy toy : new ArrayList<>(getAddToys.getSysArray())) {
            sum += toy.getProcentWinnings();
            if (randomNumber <= sum) {
                Toy selectedToy = toy;
                writeToFile(selectedToy.getToyName());
                toy.changeCount();
                getAddToys.updateArray(selectedToy, 1);
                if (toy.getCountToy() == 0) {
                    getAddToys.getSysArray().remove(toy);
                }
                break;
            }
        }
    }

    private void writeToFile(String toy) {
        try (FileWriter writer = new FileWriter("Prize.txt", true)) {
            writer.write("Prize: " + toy + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

