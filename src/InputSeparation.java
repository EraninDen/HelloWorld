public class InputSeparation {
   static String anum;
   static String rnum;
   static String oprt;
   static int control;
    public static int getP(char token) {
        if (token == '+') return 3;
        else if (token == '-') return 4;
        else if (token == '*') return 5;
        else if (token == '/') return 6;
        else if (token == ' ') return 7;
        else if (token == '1' || token == '2' || token == '3' || token == '4' || token == '5' || token == '6' || token == '7' || token == '8' || token == '9' || token == '0')
            return 1;
        else if (token == 'I' || token == 'V' || token == 'X') return 2;
        else return 0;
    }

    public static String getAnum(String expr) {

        int j;
        anum = "";

        int priority;
        for (j = 0; j < expr.length(); j++) {
            priority = getP(expr.charAt(j));

            if (priority == 1) anum += expr.charAt(j);

            if (priority > 1) {
                anum += ',';
            }
        }
        return anum;
    }

    public static String getRnum(String expr) {

        int j;
        rnum = "";

        int priority;
        for (j = 0; j < expr.length(); j++) {
            priority = getP(expr.charAt(j));

            if (priority == 2) rnum += expr.charAt(j);

            if (priority == 1 || priority > 2) {
                rnum += ',';
            }
        }
        return rnum;
    }

    public static String getOp(String expr) {

        int i;
        oprt = "";

        int priority;
        for (i = 0; i < expr.length(); i++) {
            priority = getP(expr.charAt(i));

            if (priority > 2) {
                oprt += expr.charAt(i);
            }
        }
        return oprt;
    }

    public static int getControl(String expr) {

        int k;
        control = 0;


        int priority;
        for (k = 0; k < expr.length(); k++) {
            priority = getP(expr.charAt(k));

            if (priority == 0) {
                control = 1;
                throw new RuntimeException("Недопустимый символ!!! " + expr.charAt(k));
            }
        }
        return control;
    }
}
