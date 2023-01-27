package Calculator;

public class mathOperation {
    
    public void calculate (String[] mathOperation){

        float answer;

        switch (mathOperation[1]){

            case "+":

            answer = Float.parseFloat(mathOperation[0]) + Float.parseFloat(mathOperation[2]);
            System.out.println(answer);
            break;
                
            case "-":
                answer = Float.parseFloat(mathOperation[0]) - Float.parseFloat(mathOperation[2]);
                System.out.println(answer);
                break;


            case "*":
            answer = Float.parseFloat(mathOperation[0]) * Float.parseFloat(mathOperation[2]);
                System.out.println(answer);
                break;


            case "/":
            answer = Float.parseFloat(mathOperation[0]) / Float.parseFloat(mathOperation[2]);
                System.out.println(answer);
                break;

            }
    
        }
}
