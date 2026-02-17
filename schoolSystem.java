import java.util.*;

public class schoolSystem {
     
    public static int Search(int roll[],int key){
        for(int i=0;i<roll.length;i++){
            if(roll[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int roll[]={101, 205, 310, 405, 500, 102, 607};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Roll No:-");
        int key=sc.nextInt();

        int result=Search(roll,key);

        System.out.println(result);

        if(result==-1){
            System.out.println("No student is with this roll no.");
        }else{
            System.out.println("Student found at Seat Number:" +result);
        }
    }
}
