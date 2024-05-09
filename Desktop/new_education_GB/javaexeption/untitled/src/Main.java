import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку в формате Фамилия Имя Отчество дата _ рождения номер _ телефона пол");
        System.out.print("------> ");
        String data = in.nextLine();
        in.close();
        String[] dataSplit = data.split(" ");
        if (dataSplit.length < 6){
            System.out.println("Вы ввели не все данные");
        } else if (dataSplit.length > 6) {
            System.out.println("Вы ввели данных больше чем указано");
        } else {
            SaveFile.main(ClientData.main(dataSplit));
        }
    }

}