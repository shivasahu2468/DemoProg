import java.util.Scanner;

public class InverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int[] inv = inverse(arr);

        for (int i : inv) {
            System.out.print(i+" ");
        }
        sc.close();
    }
    public static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int v = arr[i];
            inv[v] = i;
        }
        return inv;
    }
}
