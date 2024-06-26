import java.util.*;

public class Three {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        // Заполнение массива случайными значениями от 1 до 15
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15) + 1;
        }

        // Вывод содержимого массива
        System.out.println("Вывод: " + Arrays.toString(array));

        // Нахождение значений, которые встречаются более одного раза
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : array) {
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
            } else {
                counts.put(num, 1);
            }
        }

        // Вывод значений, которые встречаются более одного раза
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Число '" + entry.getKey() + "' встречается " + entry.getValue() + " раза");
            }
        }
    }
}