package ejercicios.ejercicio6;

public class StringUtil {
    public static String rpad(String s, int n, char c) {
        String finalString = "";
        finalString += s;
        for (int i = 0; i < n - s.length(); i++) {
            finalString += c;
        }
        return finalString;
    }

    public static String ltrim(String s) {
        int lastSpaceLeftPosition = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') {
                lastSpaceLeftPosition++;
            }
            else {
                break;
            }
        }
        return s.substring(lastSpaceLeftPosition);
    }

    public static String rtrim(String s) {
        int lastSpaceRightPosition = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) != ' ') {
                lastSpaceRightPosition = i+1;
            }
        }
        return s.substring(0,lastSpaceRightPosition);
    }

    public static String trim(String s) {
        return ltrim(rtrim(s));
    }

    public static int indexfOfN(String s, char c, int n) {
        int index = -1;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == c) {
                n--;
                if(n == 0) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

}
