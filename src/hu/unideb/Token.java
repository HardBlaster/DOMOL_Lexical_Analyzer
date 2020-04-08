package hu.unideb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Token {

    TK_LE ("<="),
    TK_GE (">="),
    TK_LESS ("<"),
    TK_GT (">"),
    TK_TK ("<>"),
    TK_ASSIGN (":="),
    TK_COMMENT1 ("\\(\\*\\w+\\*\\)"),
    TK_COMMENT2 ("\\{\\w+\\}"),

    INTEGER ("\\d+"),
    IDENTIFIER ("\\w+");

    private final Pattern pattern;

    Token(String regex) {
        pattern = Pattern.compile("^" + regex);
    }

    int endOfMatch(String s) {
        Matcher m = pattern.matcher(s);

        if (m.find()) {
            return m.end();
        }
        return -1;
    }
}
