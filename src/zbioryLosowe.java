import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class zbioryLosowe {

    public static void main(String[] args) {

        Random randomize = new Random();

        TreeSet<Integer> set = new TreeSet<>();

        set.add(randomize.nextInt(1000));
        set.add(randomize.nextInt(1000));
        set.add(randomize.nextInt(1000));
        set.add(randomize.nextInt(1000));

        int size = set.size();
        System.out.println(set);

        System.out.print("Najmniejszy wygenerowany: ");
        System.out.println(set.first());

        System.out.print("Najwiekszy wygenerowany: ");
        System.out.println(set.last());

        System.out.println("Srednia wynosi " + (randomize.nextInt(1000) + randomize.nextInt(1000) + randomize.nextInt(1000) + randomize.nextInt(1000))/4);
    }
}