package controlflowstatements;

public class LoopingExample {
    public static void main(String[] args) {
        //For Loop
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //While Loop
        int arr[]={2,11,45,9};
         int i=0;
         while (i < 4) {
             System.out.println(arr[i]);
             i++;
         }
         
        int j=10;
         do{
              System.out.println(j);
              j--;
         }while(j>1);
    }
  }
