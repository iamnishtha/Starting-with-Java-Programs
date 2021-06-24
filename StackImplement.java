import java.io.PrintStream;
import java.util.Scanner;

/*  Class StackImplement  */
public class StackImplement
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);        
        PrintStream out = System.out;
        out.println("Stack Test\n");
        out.println("Enter Size of Integer Stack ");
        int n = scan.nextInt();
        /* Creating object of class arrayStack */
        arrayStack stk = new arrayStack(n);
        /* Perform Stack Operations */
        char ch;
        do{
            out.println("\nStack Operations");
            out.println("1. push");
            out.println("2. pop");
            out.println("3. peek");
            out.println("4. check empty");
            out.println("5. check full");
            out.println("6. size");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                out.println("Enter integer element to push");
                try 
                {
                    stk.push( scan.nextInt() );
                }
                catch (Exception e)
                {
                    out.println("Error : " + e.getMessage());
                }                         
                break;                         
            case 2 : 
                try
                {
                    out.println("Popped Element = " + stk.pop());
                }
                catch (Exception e)
                {
                    out.println("Error : " + e.getMessage());
                }    
                break;                         
            case 3 :         
                try
                {
                    out.println("Peek Element = " + stk.peek());
                }
                catch (Exception e)
                {
                    out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                out.println("Empty status = " + stk.isEmpty());
                break;                
            case 5 :
                out.println("Full status = " + stk.isFull());
                break;                 
            case 6 : 
                out.println("Size = " + stk.getSize());
                break;                         
            default : 
                out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
            stk.display();            
            out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');     
        scan.close();            
    }
}