package utils;

public class Token {
	
	public static final int CLASSE_PALAVRA_RESERVADA = 1;
	public static final int CLASSE_IDENTIFICADOR = 2;
	public static final int CLASSE_NUMERO = 3;
	public static final int CLASSE_OPERATOR_ARITMETICO = 4;
	public static final int CLASSE_OPERATOR_RELACIONAL = 5;
	public static final int CLASSE_OPERATOR_LOGICO = 6;
	public static final int CLASSE_DELIMITADOR = 7;
		
	private int tipo;
	private String lexema;
	private int linha;
	
	public Token(int tipo, String lexema) {
		this.tipo = tipo;
		this.lexema = lexema;
	}
	
	public Token(int linha, int tipo, String lexema) {
		this.linha = linha;
		this.tipo = tipo;
		this.lexema = lexema;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getLexema() {
		return lexema;
	}
	public void setLexema(String lexema) {
		this.lexema = lexema;
	}
	public int getLinha() {
		return this.linha;
	}
	
	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	public String toString() {
		return tipo + " " + lexema;
	}

}
