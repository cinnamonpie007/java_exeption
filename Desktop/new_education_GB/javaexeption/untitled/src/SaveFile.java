import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    public static void main (String[] args) {
        String filename = args[0] + ".txt";
        try {
            File file = new File(filename);
            FileWriter writer = new FileWriter(file, true);
            if (file.exists()) {
                writer.write("\n" + args[1]);
            } else {
                writer.write(args[1]);
            }
            writer.close();
            System.out.println("Данные успешно записаны в файл: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
