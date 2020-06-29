public class Calculator {

    double total = 0;

    public Calculator() {

    }

   public double runOperation(double x, double y, char operation) throws Exception {
        switch(operation) {
            case '+':
                this.total = add(x, y);
                break;
            case '-':
                this.total = subtract(x, y);
                break;
            case '*':
                this.total = multiply(x, y);
                break;
            case '/':
                this.total = divide(x, y);
                break;
            default:
                throw new Exception("ERROR:Invalid operation! Try running the program again.");
        }

        return this.total;
    }

    public double runOperationOnTotal(int num, char operation) throws Exception {
        return runOperation(this.total, num, operation);
    }


    private double add(double x, double y) {
        return x + y;
    }

    private double subtract(double x, double y) {
        return x - y;
    }

    private double multiply(double x, double y) {
        return x * y;
    }

    private double divide(double x, double y) {
        return x / y;
    }

    public double getTotal() {
        return this.total;
    }
}
