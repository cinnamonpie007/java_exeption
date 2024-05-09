import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;


public class ClientData {

    String fio (String[] args) throws Exception{
        String fioResult;
        String fio = args[0] + args[1] + args[2];
        Pattern patWord = Pattern.compile("[a-zA-Zа-яА-Я]+");
        if (patWord.matcher(fio).matches() && !args[0].equals("") && !args[1].equals("")) {
            fioResult = args[0] + " " + args[1] + " " + args[2];
        }
        else {
            throw new Exception ("Ошибка формата в ФИО, допустимы символы кирилицы и латинницы");
        }
        return fioResult;
    }

    String birthDay (String args) throws Exception {
        String birthDayResult;
        Pattern patDate = Pattern.compile("\\d{2}.\\d{2}.\\d{4}");
        if (patDate.matcher(args).matches()){
            birthDayResult = " " + args;
        }
        else {
            throw new Exception (" Ошибка в формата даты, необходимый формат dd.mm.yyyy");
        }
        return birthDayResult;
    }

    String phone (String args) throws Exception {
        String phoneResult;
        Pattern patPhone = Pattern.compile("^[7-8]\\d{10}");
        if (patPhone.matcher(args).matches()){
            phoneResult = " " + args;
        }
        else {
            throw new Exception ("Ошибка в формата номера телефона, должен начинаться с 7 или 8 и иметь полсе 10 цифр");
        }
        return phoneResult;
    }

    String gender (String args) throws Exception {
        String genderResult;
        if (args.equals("m") || args.equals("f")){
            genderResult = " " + args;
        }
        else {
            throw new Exception (" Ошибка при определении гендера, допустимо m и f");
        }
        return genderResult;
    }

    public static String[] main(String[] args) {
        String[] result = new String[2];
        try {
            String[] fio = new String[]{args[0], args[1], args[2]};
            String fio_result = new ClientData().fio(fio);
            String date = new ClientData().birthDay(args[3]);
            String phone = new ClientData().phone(args[4]);
            String gender = new ClientData().gender(args[5]);
            result[1] = fio_result + " " + date + " " + phone + " " + gender;
            result[0] = args[2] + ".txt";

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
        return result;
    }
}