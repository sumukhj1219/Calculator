import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int priority(char op) {
        switch (op){
            case '*':
                return 3;
            case '/':
                return 3;
            case '+':
                return 2;
            case '-':
                return 2;
        }
    }

    static void traverse(String exp){
        Stack<Character>s = new Stack<Character>();

        for (int i=0; i<exp.length(); i++){
            if(exp.charAt(i) == '('){
                s.push(exp.charAt(i+1));
            }
        }

        for (int i=0; i<exp.length(); i++){
                s.push(exp.charAt(i+1));
        }

        System.out.println(s);
    }

    public static void main(String[] args){
        int res = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a expression:");
        String exp = sc.nextLine();

        traverse(exp);

        System.out.println("Expression" + exp);
    }
}