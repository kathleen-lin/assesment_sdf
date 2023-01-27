package Calculator;

public class mathOperation {
    
    private String operator;
    private float num1;
    private float num2;

    
    float answer;

    public float calculate (float num1, float num2, String operator){


        switch (operator){

            case "+":

            answer = num1 + num2;
            break;
                
            case "-":
            answer = num1 - num2;
                break;


            case "*":
            answer = num1 * num2;
                break;


            case "/":
            answer = num1 / num2;
                break;

            }

            return answer;
    
        }
}
