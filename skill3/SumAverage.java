package skill3;
public class SumAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : arr) sum += num;
        double avg = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
