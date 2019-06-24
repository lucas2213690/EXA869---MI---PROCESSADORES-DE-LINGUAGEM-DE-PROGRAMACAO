package utils;
import java.lang.StringBuilder;

public class Token {
	
	public static final String CLASSE_PALAVRA_RESERVADA = "Palavra Reservada";
	public static final String CLASSE_IDENTIFICADOR = "Identificador";
	public static final String CLASSE_NUMERO = "Numerico";
	public static final String CLASSE_OPERATOR_ARITMETICO = "Aritmetico";
	public static final String CLASSE_OPERATOR_RELACIONAL = "Relacional";
	public static final String CLASSE_OPERATOR_LOGICO = "Lógico";
	public static final String CLASSE_DELIMITADOR = "Delimitador";
		
	private int tipo;
	private String descricao;
	private String lexema;
	private int linha;
	
	public Token() {
		this.tipo = 0;
		this.descricao = null;
		this.lexema = null;
		this.linha = 0;
	}
	public Token(int tipo, String descricao, String lexema) {
		this.tipo = tipo;
		this.lexema = lexema;
		this.descricao = descricao;
	}
	
	public Token(int tipo,String descricao, String lexema, int linha) {
		this.linha = linha;
		this.tipo = tipo;
		this.lexema = lexema;
		this.descricao = descricao;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		StringBuilder mensagem = new StringBuilder();
		return mensagem.append(this.getDescricao()).append(" ").append(this.getLexema()).toString();
	}

}
