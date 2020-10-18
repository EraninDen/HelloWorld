public class Calculation {

    public static int aCalc() {
        int anum1 = 0;
        int anum2 = 0;
        char op;
        int aresult = 0;
        //
        String[] anums = InputSeparation.anum.split(",");
        try {
            anum1 = Integer.parseInt(anums[0]);
        } catch (NumberFormatException ex) {
            System.err.println("NumberFormatException");
        }
        try {
            anum2 = Integer.parseInt(anums[1]);
        } catch (NumberFormatException ex) {
            System.err.println("NumberFormatException");
        }

        if (anum1 == 0 || anum1 > 10)
            throw new RuntimeException("Недопустимое число!!! " + Integer.parseInt(anums[0]));
        if (anum2 == 0 || anum2 > 10)
            throw new RuntimeException("Недопустимое число!!! " + Integer.parseInt(anums[1]));

        op = InputSeparation.getOp(Main.expr).charAt(0);

        switch (op) {
            case '+':
                aresult = anum1 + anum2;
                break;
            case '-':
                aresult = anum1 - anum2;
                break;
            case '*':
                aresult = anum1 * anum2;
                break;
            case '/':
                aresult = anum1 / anum2;
                break;
            default:
                System.out.println("Operation don't found, please repeat again");

        }
        return aresult;
    }

    public static int getArabic(String roman) {
        int param = 0;
        switch (roman) {
            case "I":
                param = 1;
                break;
            case "II":
                param = 2;
                break;
            case "III":
                param = 3;
                break;
            case "IV":
                param = 4;
                break;
            case "V":
                param = 5;
                break;
            case "VI":
                param = 6;
                break;
            case "VII":
                param = 7;
                break;
            case "VIII":
                param = 8;
                break;
            case "IX":
                param = 9;
                break;
            case "X":
                param = 10;
                break;
        }
        return param;
    }

    public static String getRoman(int rresult) {
        String param = "";
        switch (rresult) {
            case 1:
                param = "I";
                break;
            case 2:
                param = "II";
                break;
            case 3:
                param = "III";
                break;
            case 4:
                param = "IV";
                break;
            case 5:
                param = "V";
                break;
            case 6:
                param = "VI";
                break;
            case 7:
                param = "VII";
                break;
            case 8:
                param = "VIII";
                break;
            case 9:
                param = "IX";
                break;
            case 10:
                param = "X";
                break;
            case 11:
                param = "XI";
                break;
            case 12:
                param = "XII";
                break;
            case 13:
                param = "XIII";
                break;
            case 14:
                param = "XIV";
                break;
            case 15:
                param = "XV";
                break;
            case 16:
                param = "XVI";
                break;
            case 17:
                param = "XVII";
                break;
            case 18:
                param = "XVIII";
                break;
            case 19:
                param = "XIX";
                break;
            case 20:
                param = "XX";
                break;
            case 21:
                param = "XXI";
                break;
            case 22:
                param = "XXII";
                break;
            case 23:
                param = "XXIII";
                break;
            case 24:
                param = "XXIV";
                break;
            case 25:
                param = "XXV";
                break;
            case 26:
                param = "XXVI";
                break;
            case 27:
                param = "XXVII";
                break;
            case 28:
                param = "XXVIII";
                break;
            case 29:
                param = "XXIX";
                break;
            case 30:
                param = "XXX";
                break;
            case 31:
                param = "XXXI";
                break;
            case 32:
                param = "XXXII";
                break;
            case 33:
                param = "XXXIII";
                break;
            case 34:
                param = "XXXIV";
                break;
            case 35:
                param = "XXXV";
                break;
            case 36:
                param = "XXXVI";
                break;
            case 37:
                param = "XXXVII";
                break;
            case 38:
                param = "XXXVIII";
                break;
            case 39:
                param = "XXXIX";
                break;
            case 40:
                param = "XL";
                break;
            case 41:
                param = "XLI";
                break;
            case 42:
                param = "XLII";
                break;
            case 43:
                param = "XLIII";
                break;
            case 44:
                param = "XLIV";
                break;
            case 45:
                param = "XLV";
                break;
            case 46:
                param = "XLVI";
                break;
            case 47:
                param = "XLVII";
                break;
            case 48:
                param = "XLVIII";
                break;
            case 49:
                param = "XLIX";
                break;
            case 50:
                param = "L";
                break;
            case 51:
                param = "LI";
                break;
            case 52:
                param = "LII";
                break;
            case 53:
                param = "LIII";
                break;
            case 54:
                param = "LIV";
                break;
            case 55:
                param = "LV";
                break;
            case 56:
                param = "LVI";
                break;
            case 57:
                param = "LVII";
                break;
            case 58:
                param = "LVIII";
                break;
            case 59:
                param = "LIX";
                break;
            case 60:
                param = "LX";
                break;
            case 61:
                param = "LXI";
                break;
            case 62:
                param = "LXII";
                break;
            case 63:
                param = "LXIII";
                break;
            case 64:
                param = "LXIV";
                break;
            case 65:
                param = "LXV";
                break;
            case 66:
                param = "LXVI";
                break;
            case 67:
                param = "LXVII";
                break;
            case 68:
                param = "LXVIII";
                break;
            case 69:
                param = "LXIX";
                break;
            case 70:
                param = "LXX";
                break;
            case 71:
                param = "LXXI";
                break;
            case 72:
                param = "LXXII";
                break;
            case 73:
                param = "LXXIII";
                break;
            case 74:
                param = "LXXIV";
                break;
            case 75:
                param = "LXXV";
                break;
            case 76:
                param = "LXXVI";
                break;
            case 77:
                param = "LXXVII";
                break;
            case 78:
                param = "LXXVIII";
                break;
            case 79:
                param = "LXXIX";
                break;
            case 80:
                param = "LXXX";
                break;
            case 81:
                param = "LXXXI";
                break;
            case 82:
                param = "LXXXII";
                break;
            case 83:
                param = "LXXXIII";
                break;
            case 84:
                param = "LXXXIV";
                break;
            case 85:
                param = "LXXXV";
                break;
            case 86:
                param = "LXXXVI";
                break;
            case 87:
                param = "LXXXVII";
                break;
            case 88:
                param = "LXXXVIII";
                break;
            case 89:
                param = "LXXXIX";
                break;
            case 90:
                param = "XC";
                break;
            case 91:
                param = "XCI";
                break;
            case 92:
                param = "XCII";
                break;
            case 93:
                param = "XCIII";
                break;
            case 94:
                param = "XCIV";
                break;
            case 95:
                param = "XCV";
                break;
            case 96:
                param = "XCVI";
                break;
            case 97:
                param = "XCVII";
                break;
            case 98:
                param = "XCVIII";
                break;
            case 99:
                param = "XCIX";
                break;
            case 100:
                param = "C";
                break;
        }
        return param;
    }

    public static int rCalc() {
        int rnum1 = 0;
        int rnum2 = 0;
        char op;
        int rresult = 0;
        String Rnum2 = "";
        Rnum2 = getRoman(rresult);

        String[] rnums = InputSeparation.rnum.split(",");
        rnum1 = getArabic(rnums[0]);
        rnum2 = getArabic(rnums[1]);
        if (rnum1 == 0 || rnum1 > 10)
            throw new RuntimeException("Недопустимое римское число!!! " + getArabic(rnums[0]));
        if (rnum2 == 0 || rnum2 > 10)
            throw new RuntimeException("Недопустимое римское число!!! " + getArabic(rnums[1]));

        op = InputSeparation.getOp(Main.expr).charAt(0);

        switch (op) {
            case '+':
                rresult = rnum1 + rnum2;
                break;
            case '-':
                rresult = rnum1 - rnum2;
                break;
            case '*':
                rresult = rnum1 * rnum2;
                break;
            case '/':
                rresult = rnum1 / rnum2;
                break;
            default:
                System.out.println("Operation don't found, please repeat again");
        }
        return rresult;
    }
}

