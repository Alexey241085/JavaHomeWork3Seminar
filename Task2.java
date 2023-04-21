// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф. из этого списка.
import java.util.ArrayList;
import java.util.Random;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int num = random.nextInt(10);
            list.add(num);
        }
        System.out.println("Список:\n" + list);
        int max = max(list);
        int min = min(list);
       
        int sumnums = 0;
        
        for (int j = 0; j < list.size(); j++) {
            sumnums = sumnums + list.get(j);
        }

        float srArif = (float)sumnums/list.size();

        System.out.println("Значение максимум: " + max);
        System.out.println("Значение максимум: " + min);
        System.out.println("Сумма значений: " + sumnums);
        System.out.println("Всего элементов: " + list.size());
        System.out.println("Значение среднее африф.: " + srArif);
    }

}