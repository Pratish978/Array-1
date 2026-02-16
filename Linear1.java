//Time complexity :- O(n) Because loop checks every number.

public class Linear1 {
     

    public static int Menu1(String menu[],String Dish){

        for(int i=0;i<=menu.length;i++){
            if(menu[i] == Dish){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[]={"Dosa","Samosa","Idli","Wada paw"};
        String Dish="Samosa";

        int index=Menu1(menu, Dish);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Dish is at index : " + index);
        }
    }
}
