import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char op = sc.next().charAt(0);

            int result = cal.calculate(num1, num2, op);
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력시 종료): ");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }
        }
    }
}
