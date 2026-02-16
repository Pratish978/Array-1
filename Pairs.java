public class Pairs {
    
    public static void Pairs1(int num[]){

        int tp=0;//Total pairs

        for(int i=0;i<num.length;i++){
            int curr= num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" + curr + "," + num[j] + ")  ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs=" + tp);
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10};

        Pairs1(num);
    }
}
