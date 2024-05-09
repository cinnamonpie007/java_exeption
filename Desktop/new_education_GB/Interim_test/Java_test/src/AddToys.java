import java.util.ArrayList;

class AddToys {

    private final ArrayList<Toy> sysToys = new ArrayList<>();
    private final ArrayList<ArrayList<String>> outToysArray = new ArrayList<>();

    public void addToys(Toy toy) {
        sysToys.add(toy);
        getAddToy(toy);
    }

    private ArrayList<String> getAddToy(Toy toy) {
        ArrayList<String> toys = new ArrayList<>();
        toys.add("id: " + toy.getId());
        toys.add("Name: " + toy.getToyName());
        toys.add("Count: " + toy.getCountToy());
        toys.add("Procent: " + toy.getProcentWinnings());
        outToysArray.add(toys);
        return toys;
    }

    public void changeProcent(int toyId, int newProcent) {
        for (Toy toy : sysToys) {
            if (toy.getId() == toyId) {
                toy.changeProcentWinnings(newProcent);
                updateArray(toy, 0);
                break;
            }
        }
    }

    public void updateArray(Toy toy, int whatChange) {
        for (ArrayList<String> arr : outToysArray) {
            if (whatChange == 0) {
                if (arr.get(0).equals("id: " + toy.getId())) {
                    arr.set(3, "Procent: " + toy.getProcentWinnings());
                    break;
                }
            } else if (whatChange == 1) {
                if (arr.get(0).equals("id: " + toy.getId())) {
                    arr.set(2, "Count: " + toy.getCountToy());
                    break;
                }
            }
        }
    }

    public ArrayList<ArrayList<String>> getToysArray() {
        return outToysArray;
    }

    public ArrayList<Toy> getSysArray() {
        return sysToys;
    }
}


