public class Logic {
    public static int getLogic() {
        int logic = 0;
        boolean start = InputSeparation.getAnum(Main.expr).startsWith(",");
        boolean end = InputSeparation.getAnum(Main.expr).endsWith(",");
        boolean start2 = InputSeparation.getRnum(Main.expr).startsWith(",");
        if (start && !start2 && end) {
            logic += 1;
        } else if (!start && start2 && !end) {
            logic += 2;
        } else
        {
            logic = 3;
        }
        return logic;
    }
}
