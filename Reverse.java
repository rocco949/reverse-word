import java.util.Scanner;

public class Reverse {
    final static Scanner obj_sc = new Scanner(System.in);
    final static Reverse obj_rv = new Reverse();

    static String word;

    public static void reverse(String[] word, int length) {
        for (int i = length; i >= 0; --i) {
            System.out.print(word[i]);  
        }
        System.out.println("\n");
        obj_rv.ending();
    }

    static void palDetection(word1, word2) {
       return (word1 == word2) ?  true:false;
    }

    public void starter() {
        System.out.println("Enter a word: ");
        word = obj_sc.nextLine();
        reverse(word.split(""), word.length() - 1);
    }
    
    public Boolean doItAgain() {
        System.out.println("You wish to do it again (Y,n)");
        String answer = obj_sc.nextLine();
        Boolean returnValue = 
        (answer.equalsIgnoreCase("Y"))?true : false;

        return returnValue;
    }

    public void ending() {
        if(obj_rv.doItAgain()) {
            System.out.println("");
            obj_rv.starter();
        } else {
            System.out.println("Bye!");
        }
    }

    public static void main(String[] args){
        obj_rv.starter();
    }
        }