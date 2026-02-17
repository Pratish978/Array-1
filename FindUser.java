import java.util.*;

public class FindUser {
    
    public static int Find(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[]={12, 45, 67, 23, 89, 10, 56};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an key");
        int key=sc.nextInt();

        int result=Find(num,key);
        System.out.println(result);

        if (result == -1) {
             System.out.println("Better luck next time");
            } else {
                System.out.println( result);
            }
    }
}
