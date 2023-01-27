package Calculator;

import java.io.Console;

public class Main {
 
    public static void main(String[] args) {
        System.out.println("Welcome.");

        Console cons = System.console();
        String input = cons.readLine("> ");

        Float $last = (float) 0;
        Float num1, num2;

        
        // for (int i = 0; i < mathOperation.length; i++){
        //     System.out.println(mathOperation[i]);
        // }
        while (!input.equals("exit")){


            String[] mathOperation = input.split(" ");

            if (mathOperation[0].equals("$last")){
                num1 = $last;
            } else {
                num1 = Float.parseFloat(mathOperation[0]);
            }

            if (mathOperation[2].equals("$last")){
                num2 = $last;
            } else {
                num2 = Float.parseFloat(mathOperation[2]);
            }


            mathOperation getAnswer = new mathOperation();
            $last = getAnswer.calculate(num1, num2, mathOperation[1]);
            System.out.println($last);
            input = cons.readLine("> ");
            

        }
        System.out.println("Bye bye");
        
    }
}
