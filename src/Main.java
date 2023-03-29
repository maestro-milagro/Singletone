import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка:");
        int input1 = scanner.nextInt();
        List<Integer> source = new ArrayList<>();
        Random random = new Random();
        System.out.println("Введите верхнюю границу для значений");
        int input2 = scanner.nextInt();
        for (int i = 0; i < input1; i++) {
            source.add(random.nextInt(input2));
        }
        logger.log("Создаём и наполняем список");
        System.out.println("Вот случайный список: " + source);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int input3 = scanner.nextInt();
        Filter filter = new Filter(input3);
        filter.filterOut(source);
        logger.log("Завершаем программу");

    }
}
