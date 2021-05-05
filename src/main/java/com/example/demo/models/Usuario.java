package com.example.demo.models;

public class Usuario {
	private String email;
	private String contrasenha;
	
	public Usuario() {}

	public Usuario(String email, String contrasenha) {
		super();
		this.email = email;
		this.contrasenha = contrasenha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenha() {
		return contrasenha;
	}

	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", contrasenha=" + contrasenha + "]";
	}
}
