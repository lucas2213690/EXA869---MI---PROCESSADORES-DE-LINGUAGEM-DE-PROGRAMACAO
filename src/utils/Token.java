package utils;

public class Token {
	
	public static final int CLASSE_PALAVRA_RESERVADA = 1;
	public static final int CLASSE_IDENTIFICADOR = 2;
	public static final int CLASSE_NUMERO = 3;
	public static final int CLASSE_OPERATOR_ARITMETICO = 4;
	public static final int CLASSE_OPERATOR_RELACIONAL = 5;
	public static final int CLASSE_OPERATOR_LOGICO = 6;
	public static final int CLASSE_DELIMITADOR = 7;
	public static final int CLASSE_SIMBOLO = 8;
	
	private int tipo;
	private String lexema;
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

}
