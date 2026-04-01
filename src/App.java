import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator cal = new ArithmeticCalculator();

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            String input = sc.next();
            OperatorType op;
            if(input.equals("+")) {
                op = OperatorType.ADD;
            } else if (input.equals("-")) {
                op = OperatorType.SUB;
            } else if (input.equals("*")) {
                op = OperatorType.MUL;
            } else if (input.equals("/")) {
                op = OperatorType.DIV;
            } else {
                System.out.println("잘못된 연산자입니다");
                continue;
            }

            int result = cal.calculate(num1, num2, op);

            System.out.println("결과: " + result);

            System.out.println("삭제하시겠습니까? (yes 입력 시 삭제): ");
            String remove = sc.next();

            if (remove.equals("yes")) {
                cal.removeFirstResult();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료): ");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }
        }
    }
}
