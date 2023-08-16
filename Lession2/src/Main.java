import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        // Создание генератора сундуков с золотом
        ItemFabric goldGenerator = new GoldGenerator();
        goldGenerator.openReward();

        // Создание генератора сундуков с драгоценными камнями
        ItemFabric gemGenerator = new GemGenerator();
        gemGenerator.openReward();

        // Создание генератора пустых сундуков
        ItemFabric emptyChestGenerator = new EmptyChestGenerator();
        emptyChestGenerator.openReward();

        // Создание генератора случайных чисел для выбора типа награды
        Random rnd = ThreadLocalRandom.current();

        // Список генераторов наград
        List<ItemFabric> fabricList = new ArrayList<>();
        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new EmptyChestGenerator()); // Добавляем генератор пустых сундуков

        // Цикл для создания и открытия наград в разных сундуках
        for (int i = 0; i < 20; i++) {
            // Выбор случайного индекса для выбора генератора награды
            int index = rnd.nextInt(fabricList.size());
            ItemFabric fabric = fabricList.get(index);

            // Создание и открытие награды с использованием текущего генератора
            fabric.openReward();
        }
    }
}