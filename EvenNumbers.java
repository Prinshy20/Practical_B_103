import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> evenList = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
                sum += i;
            }
        }

        System.out.println("List of Even Numbers:");
        System.out.println(evenList);

        System.out.println("Minimum Even Number: " + evenList.get(0));
        System.out.println("Maximum Even Number: " + evenList.get(evenList.size() - 1));
        System.out.println("Total Sum: " + sum);
    }
}