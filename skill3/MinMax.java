package skill3;
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 89, 33};
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
