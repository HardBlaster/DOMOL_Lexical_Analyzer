package hu.unideb;

public class Main {

    public static void main(String[] args) {

        DOMOLParser domolParser = new DOMOLParser("E:\\Fordítóprogramok\\Lexikális elemző\\src\\resources\\test.txt");

        System.out.println("Lexical Analysis");
        System.out.println("-----------------");
        while (!domolParser.isExhausted()) {
            System.out.printf("%-18s :  %s \n",domolParser.currentLexema() , domolParser.currentToken());
            domolParser.moveAhead();
        }

        if (domolParser.isSuccessful()) {
            System.out.println("The input program is lexically correct!");
        } else {
            System.out.println(domolParser.errorMessage());
        }
    }
}
