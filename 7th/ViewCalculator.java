import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первое число: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, -, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второе число: ");
                    calculator.multi(arg);
                    continue;
                }

                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второе число: ");
                    calculator.sum(arg);
                    continue;
                }

                if (cmd.equals("/")) {
                    int arg = promptInt("Введите второе число: ");
                    calculator.divide(arg);
                    continue;
                }

                if (cmd.equals("-")) {
                    int arg = promptInt("Введите второе число: ");
                    calculator.minus(arg);
                    continue;
                }

                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
                
            }            
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
