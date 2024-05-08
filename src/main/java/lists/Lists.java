package lists;
import java.util.*;

public class Lists {
    public static void main(String[] args) {
        List<String> anime = new ArrayList<>();
        anime.add("One Piece");
        anime.add("Dragon ball z");
        anime.add("Naruto");
        anime.add("Bleach");
        System.out.println("Anime list: " + anime);

        String animes = anime.get(1);
        System.out.println("Accessed Element: " + animes);

        String removeAnime = anime.remove(1);
        System.out.println("Removed Element: " + removeAnime);
        System.out.println("==================================");

        List<String> sports = new LinkedList<>();
        sports.add("Rugby");
        sports.add("Football");
        sports.add("Hockey");
        sports.add("Tennis");
        String sport = sports.get(3);
        System.out.println("Accessed Element: " + sport);
        String index = String.valueOf(sports.indexOf("Rugby"));
        System.out.println("Position of Rugby is: " + index);
        String removeHockey = sports.remove(2);
        System.out.println("Sport removed: " + removeHockey);
        System.out.println("==================================");

        Queue<Integer> dollarBills = new LinkedList<>();

        dollarBills.add(1);
        dollarBills.add(5);
        dollarBills.add(10);
        dollarBills.add(20);
        dollarBills.add(50);
        dollarBills.add(100);
        System.out.println("Queue: " + dollarBills);

        int accessedNumber = dollarBills.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        int removedNumber = dollarBills.poll();
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("Updated queue: " + dollarBills);
        System.out.println("==================================");
        HashMap<Integer,String> athletes = new HashMap<>();
        athletes.put(10,"Messi");
        athletes.put(22,"De Jong");
        athletes.put(11,"Reus");
        athletes.put(23,"Jordan");
        String athlete = athletes.get(10);
        System.out.println("Values of index 1: " + athlete);
        System.out.println(athletes.keySet());
        System.out.println(athletes.values());
        System.out.println(athletes.entrySet());
        System.out.println("==================================");
        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println(oddNumbers);
        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(oddNumbers);
        numbers.add(7);
        System.out.println("New HashSet: " + numbers);
        System.out.println("==================================");
        ArrayList<String> names = new ArrayList<>();
        names.add("Goku");
        names.add("Itachi");
        names.add("Luffy");
        System.out.println("ArrayList: " + names);
        Iterator<String> iterator = names.iterator();
        String name = iterator.next();
        System.out.println("Accessed Element: " + name);
        iterator.remove();
        System.out.println("Removed Element: " + name);

        while(iterator.hasNext()){
            iterator.forEachRemaining((value) -> System.out.print(value + ", " ));
        }
    }
}
