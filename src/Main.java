public class Main {
  static  String expr;


    public static void main(String[] args) {

        System.out.println("Введите ваше выражение: ");
        ReadClassCalc scan = new ReadClassCalc();
       expr = scan.str;

        switch (Logic.getLogic()){
            case 1:
                System.out.println(Calculation.getRoman(Calculation.rCalc()));
                break;
            case 2:
                System.out.println(Calculation.aCalc());
                break;
            default:
                System.out.println("Неверный формат ввода");
        }

    }
}
