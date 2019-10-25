package com.itt.libreria;

public class Libro {
	
	private String titulo;
	private String genero;
	Autor miAutor= new Autor("Pablo","Bio1");
	
	public Libro(String ptitulo, String pgenero, Autor pautor) {
		
		this.titulo = ptitulo;
		this.genero = pgenero;
		this.miAutor = pautor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Autor getMiAutor() {
		return miAutor;
	}

	public void setMiAutor(Autor miAutor) {
		this.miAutor = miAutor;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", genero=" + genero + ", miAutor=" + miAutor + "]";
	}
	
	
	
	

}
