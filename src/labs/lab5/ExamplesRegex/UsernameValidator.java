package labs.lab5.ExamplesRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {
    
    private Pattern pattern;
    private Matcher matcher;

    private static final String USERNAME_PATTERN = "^[a-z0-9_]{3-15}$";

    // В конструктора Java компилира стринга на Regex в изпълним обект Pattern. 
    // Това се прави еднократно, обикновено в конструктора.
    public UsernameValidator() {
        pattern = Pattern.compile(USERNAME_PATTERN);
    }

    public boolean validateUsername(final String username) {
        matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
