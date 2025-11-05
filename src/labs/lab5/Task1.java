package labs.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    
    // Главна буква от N, R, B, Q (0 или 1 път)
    // малка буква x (0 или 1 път)
    // буква от а-h 
    // число от 1-8 
    // + или # (0 или 1 път)
    
    private static Pattern pattern1 = Pattern.compile("[NRBQ]?x?[a-h][1-8][+#]?");

    public static boolean isValidChessMove(String move) {
        Matcher matcher = pattern1.matcher(move);
        return matcher.matches(); 
    }

    public static void main(String[] args) {
        System.out.println("Is valid? " + isValidChessMove("Ne8")); 
        System.out.println("Is valid? " + isValidChessMove("1a"));   
    }
}


    

