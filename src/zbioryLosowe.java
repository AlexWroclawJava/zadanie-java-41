import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class zbioryLosowe {

    public static void main(String[] args) {

        Random randomize = new Random();

        TreeSet<Integer> set = new TreeSet<>();

        int licznik = 50;
        double suma = 0;
        int liczba = 0;
        for (int i = 1; i <= licznik; i++) {
            liczba = randomize.nextInt(1000);
            set.add(liczba);
            suma = suma + liczba;
        }

        int size = set.size();
        System.out.println(set);

        System.out.print("Najmniejszy wygenerowany: ");
        System.out.println(set.first());

        System.out.print("Najwiekszy wygenerowany: ");
        System.out.println(set.last());

        System.out.println("Srednia wynosi: " + suma / 50 );

        System.out.println("Wszystkie liczby mniejsze od średniej to: ");
        for (Integer integer : set) {
            if (integer < (suma / 50)){
                System.out.print(integer + " ");
            }
        }
    }
}