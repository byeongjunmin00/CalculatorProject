import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {

    private ArrayList<T> results = new ArrayList<>();

    public T calculate(T num1, T num2, OperatorType op) {

        double a = num1.doubleValue();
        double b = num2.doubleValue();
        double result = 0;

        if (op == OperatorType.ADD) {
            result = a + b;
        } else if (op == OperatorType.SUB) {
            result = a - b;
        } else if (op == OperatorType.MUL) {
            result = a * b;
        } else if (op == OperatorType.DIV) {
            if (b == 0) {
                System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다");
                return null;
            }

            result = a / b;
        }


        results.add((T)(Double)result);
        return (T)(Double)result;
    }

        public ArrayList<T> getResults() {
            return results;
    }

        public void setResults(ArrayList<T> results) {
            this.results = results;
    }

        public void removeFirstResult() {
            if (!results.isEmpty()) {
                results.remove(0);
            }
        }
        public void getResultsGreatorThan(double value) {
            results.stream()
                    .filter(r -> r.doubleValue() > value)
                    .forEach(r -> System.out.println(r));

        }
    }