import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        // Примеры строк для проверки
        String input1 = "abcdefghijklmnopqrstuv18340";  // правильный пример
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340";  // неправильный пример

        // Проверка строк с использованием регулярного выражения
        checkMatch("^abcdefghijklmnopqrstuv18340$", input1);
        checkMatch("^abcdefghijklmnopqrstuv18340$", input2);
    }

    public static void checkMatch(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Ввод соответствует шаблону: " + input);
        } else {
            System.out.println("Ввод не соответствует шаблону: " + input);
        }
    }
}


