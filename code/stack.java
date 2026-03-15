package code;
import java.util.Stack;
public class stack{
    public static void main(String[] args){
        // stack = LIFO data structure. Last in first out
        //         store objects into sort of "vertical tower"
        //         push() to add to the top 
        //         pop() to remove from the top
        //example:
        // stack<String> stack = new Stack<String>();
        // stack.push("A");
        // stack.push("B");
       // stack.pop(); // Removes "B"
       
       Stack<String> stack = new Stack<String>();
    //    System.out.println(stack.empty()); // true
         stack.push("Minecraft");
         stack.push("Valorant");
         stack.push("Fortnite");
         stack.push("Apex Legends");
         stack.push("Counter-Strike: Global Offensive");

         System.out.println(stack.size());
         
        //  System.out.println(stack.peek());
        // //  String myFavGame =stack.pop();
        // //     System.out.println(myFavGame); // Counter-Strike: Global Offensiv
        // //  stack.pop();
        //     // System.out.println(stack.empty()); // false
        //     // System.out.println(stack.peek()); // Counter-Strike: Global Offensiv
        // System.out.println(stack);
        System.out.println(stack.search("cs2")); 
        System.out.println(stack.search("Minecraft"));
        // Use of stack ?
        //1. undo //redo  feature in the text editor 
        //2. moving back and forward throught browser history
        //3. backtracking algorithms (maze, file directory, etc)
        //4. calling functions (call stack)



    }

}