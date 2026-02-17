public class SubArray {
    public static void printSubarrays(int num[]) {
        int ts = 0; // Total Subarrays counter

        for (int i = 0; i < num.length; i++){
            int start=i;
            for (int j = i; j < num.length; j++){
                int end=j;
                System.out.print("[ ");

                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                }
                ts++; 
                System.out.print("] ");
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + ts);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        printSubarrays(num);
    }
}