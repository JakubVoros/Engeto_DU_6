package engeto_DU6;

public class Calculator  {

    protected double valueA;
    protected double valueB;
    protected MathOperation operation;


    public static double calculate (double valueA,MathOperation operation, double valueB){
                switch (operation) {
                    case ADDITION:
                        return valueA + valueB;
                    case DIVISION:
                        return valueA/valueB;
                    case SUBTRACTION:
                        return valueA - valueB;
                    case MULTIPLICATION:
                        return valueA * valueB;
                    default:
                        throw new IllegalStateException("Invalid operation: " + operation);
                }

    };

}
