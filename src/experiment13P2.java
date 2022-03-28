import java.util.Comparator;
import java.util.TreeSet;

public class experiment13P2 {
    public static void main(String[] args) {

        System.out.println("Tanay" + 1955991593);

        TreeSet<String> cities = new TreeSet<>((Comparator) new cities_Comparator());
        cities.add("Chandigarh");
        cities.add("Hyderabad");
        cities.add("Indore");
        cities.add("Delhi");
        System.out.println("TreeSet: " + cities);
    }
    public static class cities_Comparator implements Comparator<String> {
        @Override
        public int compare(String cities_one, String cities_two) {
            int value =  cities_one.compareTo(cities_two);
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }
        }
    }
}
