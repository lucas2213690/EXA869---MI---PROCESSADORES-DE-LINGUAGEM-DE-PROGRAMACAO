package analisador.lexico;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import utils.Token;

public class Lexico {
	
	private final String numerico = ("^\\d+|^\\d+\\.?\\d+");
	private final String identificador = ("^\\D\\w+|^\\D\\w?$");
	
	private Hashtable<Integer, String> reservadas =  
	        new Hashtable<Integer, String>();
	
	private Hashtable<Integer, String> delimitadores =  
	        new Hashtable<Integer, String>();
	
	private final Hashtable<Integer, String> relacionais =  
	        new Hashtable<Integer, String>();
	
	private final Hashtable<Integer, String> aritmeticos =  
	        new Hashtable<Integer, String>();
	
	private final Hashtable<Integer, String> logicos =  
	        new Hashtable<Integer, String>();
	
	private List<Token> tokens = new ArrayList();
	private FileInputStream path;
	private int linha;
	private int coluna;
	
	
	public Lexico(String path) {
		reservadas.put(1, "programa"); 
        reservadas.put(2, "constantes"); 
        reservadas.put(3, "variaveis"); 
        reservadas.put(4, "metodo"); 
        reservadas.put(5, "resultado");
        reservadas.put(6, "principal");
        reservadas.put(7, "se");
        reservadas.put(8, "entao");
        reservadas.put(9, "senao");
        reservadas.put(10, "enquanto");
        reservadas.put(11, "leia");
        reservadas.put(12, "escreva");
        reservadas.put(13, "vazio");
        reservadas.put(14, "inteiro");
        reservadas.put(15, "real");
        reservadas.put(16, "boleano");
        reservadas.put(17, "texto");
        reservadas.put(18, "verdadeiro");
        reservadas.put(19, "falso");
        
        delimitadores.put(1, ";");
        delimitadores.put(2, ",");
        delimitadores.put(3, "(");
        delimitadores.put(4, ")");
        delimitadores.put(5, "[");
        delimitadores.put(6, "]");
        delimitadores.put(7, "{");
        delimitadores.put(8, "}");
        delimitadores.put(9, ".");
        
        logicos.put(1, "!");
        logicos.put(2, "&&");
        logicos.put(1, "||");
        
	}

}
