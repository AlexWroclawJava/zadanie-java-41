import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class zbioryLosowe {

    public static void main(String[] args) {

        Random randomize = new Random();

        TreeSet<Integer> set = new TreeSet<>();

        double suma = 0;
        int liczba = 0;
        int rozmiarZbioru = 50;

        while (set.size() < 50){
            liczba = randomize.nextInt(1000);
            if (!set.contains(liczba)) {
                set.add(liczba);
                suma = suma + liczba;
            }
            else set.remove(liczba);
            suma = suma;
        }

        int size = set.size();
        System.out.println(set);


        System.out.print("\nNajmniejsza wygenerowana liczba to: ");
        System.out.println(set.first());

        System.out.print("Największa wygenerowana liczba to: ");
        System.out.println(set.last());

        System.out.println("Średnia z 50 liczb wynosi: " + suma / 50 );

        System.out.println("Wszystkie liczby większe od średniej to: ");
        for (Integer integer : set) {
            if (integer > (suma / 50)){
                System.out.print(integer + " ");
            }
        }

        if (set.size() == 50)
        System.out.println("\n\n Rozmiar zbioru powinien wynosić dokładnie 50 i wynosi: " + set.size() + ", Test passed OK");
        else System.out.println("\nObecny rozmiar zbioru wynosi: " + set.size() + ", Test failed");
    }
}