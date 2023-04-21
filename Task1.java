import java.util.Random;
import java.util.ArrayList;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа


public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(-10, 10);
            list.add(val);
        }
        System.out.println("Первоначальный список:\n " + list);
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println("Список: удалены четные числа:\n " + list);
    }
}
    

    

