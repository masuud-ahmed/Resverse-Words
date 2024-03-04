import java.util.Scanner;
import java.util.Stack;

public class reversal {
    public static void main(String[] args){
        Scanner rever = new Scanner(System.in);
        System.out.println("gali eray aad u rabto tijaabo");

        Stack <Character>  Collection = new Stack<>();
        String userInput = rever.nextLine();

        for (int i=0; i <userInput.length();i++){
            Collection.push(userInput.charAt(i));
        }

        while (!Collection.isEmpty()){
            System.out.print(Collection.peek());
            Collection.pop();
        }
    }

}
