import java.util.ArrayList;

public class ArithmeticCalculator {

    private ArrayList<Integer> results = new ArrayList<>();

    public int calculate(int num1, int num2, OperatorType op) {

        int result = 0;

        if (op == OperatorType.ADD) {
            result = num1 + num2;
        } else if (op == OperatorType.SUB) {
            result = num1 - num2;
        } else if (op == OperatorType.MUL) {
            result = num1 * num2;
        } else if (op == OperatorType.DIV) {
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다");
                return 0;
            }

            result = num1 / num2;
        }


        results.add(result);
        return result;
    }

    public ArrayList<Integer> getResults() {
        return results;
    }

    public void setResults(ArrayList<Integer> results) {
        this.results = results;
    }

        public void removeFirstResult() {
            if (!results.isEmpty()) {
                results.remove(0);

            }
        }

    }