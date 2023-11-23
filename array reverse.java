import java.util.*;

class ArrayReverse {
    public static void main(String args[]) {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[] = new int[size];
        int element;
        for (int i = 0; i < size; i++) {
            element = sc.nextInt();
            arr[i] = element;
        }
        int arr1[] = new int[size];
        int f = 0;
        for (int j = size - 1; j >= 0; j--) {
            arr1[f] = arr[j];
            f++;
        }
        System.out.println("Reverse Array:");
        for (int a = 0; a < size; a++) {
            System.out.print(arr1[a] + " ");
        }
    }
}
