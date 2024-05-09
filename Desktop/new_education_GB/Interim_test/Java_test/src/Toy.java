import java.util.Map;

public class Toy {

    protected int id;

    protected String toyName;

    protected int countToy;

    protected int procentWinnings;

    protected Toy (int id, String toyName, int countToy, int procentWinnings){
        this.id = id;
        this.toyName = toyName;
        this.countToy = countToy;
        this.procentWinnings = procentWinnings;
    }

    public int getId(){
        return id;
    }

    public String getToyName(){
        return toyName;
    }

    public int getCountToy(){
        return countToy;
    }

    public int getProcentWinnings(){
        return procentWinnings;
    }

    public void changeProcentWinnings(int newProcent){
        this.procentWinnings = newProcent;
    }

    public void changeCount(){
        this.countToy--;
    }


}