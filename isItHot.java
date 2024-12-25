import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int input = scan.nextInt();
        
        int [] array = new int [input];
        
        for (int i = 0; i < input; i++){
            array[i] = scan.nextInt(); 
        }
        for(int num : array){
            if(num == 1){
                System.out.println("HOT");
            }else if(num == 2){
                System.out.println("LUKE WARM");
            }else if(num == 3){
                System.out.println("COLD");
            }else{
                System.out.println("Out of Range!!!!");
            }
        }
    }
}
