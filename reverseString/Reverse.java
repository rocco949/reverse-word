import java.util.Scanner;


public class Reverse {
    

    public static void reverse(String[] word, int length) {
         Reverse obj_rv = new Reverse();
        for (int i = length; i >= 0; --i) {
            
            System.out.print(word[i]);
        }
        System.out.println();
         obj_rv.ending();
    }

    public void starter() {
        Scanner obj_sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = obj_sc.nextLine();
        
        reverse(word.split(""), word.length() - 1);
    }
    
    public Boolean doItAgain() {
        Scanner obj_sc = new Scanner(System.in);

        System.out.println("You wish to do it again (Y,n)");
        String answer = obj_sc.nextLine();

        Boolean returnValue = (answer.equalsIgnoreCase("Y"))?true : false;

        return returnValue;
    }

    public void ending() {
        Reverse obj_rv = new Reverse();
        if(obj_rv.doItAgain()) {
            System.out.println("");
            obj_rv.starter();
        } else {
            System.out.println("Bye!");
        }
    }

    public static void main(String[] args){
        Reverse obj_rv = new Reverse();

        obj_rv.starter();
        


        
}

        }

        