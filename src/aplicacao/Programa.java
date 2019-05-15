package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1,"Ezequiel Santana", "EzeAna@gmail.com");
		Pessoa p2 = new Pessoa(2,"Fabio mello", "famello@gmail.com");
		Pessoa p3 = new Pessoa(3,"Elian morais", "Elimorais@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
