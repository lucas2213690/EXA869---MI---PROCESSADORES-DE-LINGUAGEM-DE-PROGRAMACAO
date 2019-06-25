package analisador.lexico;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import utils.Token;
import java.util.regex.*;  

public class Lexico {
	
	private static final String numerico = ("[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?");
	private static final String identificador = ("^[a-zA-Z$][a-zA-Z_$0-9]*$");
	private static final String delimitador = (";|,|(|)|[|]|\\{|\\}|.");
	private static final String aritmetico = (" \\+|-|\\*|/|\\++|--");
	private static final String logico = ("!|&&|||");
	private static final String relacional = ("!=|==|<|<=|>|>=|=");
	private static final String palavraReservada = ("programa|constantes|variaveis|metodo|resultado|principal|senao|entao|se|enquanto|leia|escreva|vazio|inteiro|real|boleano|texto|verdadeiro|falso");
	private List<Token> tokens = new ArrayList();
	private FileInputStream path;
	private int linha;
	
	public Lexico(String dir) throws FileNotFoundException {
		
		File folder = new File(dir);
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		    	Scanner scanner = new Scanner(file);
		    	while (scanner.hasNext()) {
		    		if(scanner.hasNext(Lexico.palavraReservada))
						analyze(scanner.next());
					else if (scanner.hasNext(Lexico.identificador))
						analyze(scanner.next());
					else if (scanner.hasNext(Lexico.delimitador))
						analyze(scanner.next());
					else if (scanner.hasNext(Lexico.relacional))
						analyze(scanner.next());
					else if (scanner.hasNext(Lexico.logico))
						analyze(scanner.next());
					else if (scanner.hasNext(Lexico.numerico))
						analyze(scanner.next());
					else
						scanner.next();
					
		    	
		    }
		}
		
		System.out.println(tokens);
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
             
                          
        
	}

}
