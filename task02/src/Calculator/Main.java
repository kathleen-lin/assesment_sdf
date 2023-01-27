package Calculator;

import java.io.Console;

public class Main {
 
    public static void main(String[] args) {
        System.out.println("Welcome.");

        Console cons = System.console();
        String input = cons.readLine("> ");

        
        // for (int i = 0; i < mathOperation.length; i++){
        //     System.out.println(mathOperation[i]);
        // }
        while (!input.equals("exit")){


            String[] mathOperation = input.split(" ");
            mathOperation getAnswer = new mathOperation();
            getAnswer.calculate(mathOperation);
            input = cons.readLine("> ");

        }
        System.out.println("Bye bye");
        
    }
}
