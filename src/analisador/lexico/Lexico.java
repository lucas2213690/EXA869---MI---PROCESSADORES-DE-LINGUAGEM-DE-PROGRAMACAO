package analisador.lexico;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import utils.Token;
import java.util.regex.*;  

public class Lexico {
	
	private final String numerico = ("[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?");
	private final String identificador = ("^[a-zA-Z$][a-zA-Z_$0-9]*$");
	private final String delimitador = (";|,|(|)|[|]|\\{|\\}|.");
	private final String aritmetico = (" \\+|-|\\*|/|\\++|--");
	private final String logico = ("!|&&|||");
	private final String relacional = ("!=|==|<|<=|>|>=|=");
	private final String palavraReservada = ("programa|constantes|variaveis|metodo|resultado|principal|senao|entao|se|enquanto|leia|escreva|vazio|inteiro|real|boleano|texto|verdadeiro|falso");
	private List<Token> tokens = new ArrayList();
	private FileInputStream path;
	private int linha;
	
	public Lexico(String dir) {
		File folder = new File("dir");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        System.out.println(file.getName());
		    }
		}
	}
	public void analyze(String lexema) {
			
			
             //System.out.println(Pattern.matches(relacional, "=="));
             if (Pattern.matches(palavraReservada, lexema)) {
            	 tokens.add(new Token(1, Token.CLASSE_PALAVRA_RESERVADA ,lexema));
             }
             else if (Pattern.matches(identificador, lexema)) {
            	 tokens.add(new Token(2,Token.CLASSE_IDENTIFICADOR ,lexema));
             }
             else if (Pattern.matches(numerico, lexema)) {
            	 tokens.add(new Token(3,Token.CLASSE_NUMERO ,lexema));
             }
             else if (Pattern.matches(aritmetico, lexema)) {
            	 tokens.add(new Token(4,Token.CLASSE_OPERATOR_ARITMETICO ,lexema));
             }
             else if (Pattern.matches(relacional, lexema)) {
            	 tokens.add(new Token(5,Token.CLASSE_OPERATOR_RELACIONAL ,lexema));
             }
             else if (Pattern.matches(logico, lexema)) {
            	 tokens.add(new Token(6,Token.CLASSE_OPERATOR_LOGICO ,lexema));
             }
             else if (Pattern.matches(delimitador, lexema)) {
            	 tokens.add(new Token(7,Token.CLASSE_DELIMITADOR ,lexema));
             }
             
             System.out.println(tokens.toString());
             
        
	}

}
