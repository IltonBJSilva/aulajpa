package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Iniciar a transação
		em.getTransaction().begin();

		//Pesquisar pessoa no banco passando o nome da class e o .class
		Pessoa p01 = em.find(Pessoa.class, 1);
		//Printar na tela
		System.out.println(p01+"\n--------------");
		
		//Pesquisar pessoa no banco passando o nome da class e o .class
		Pessoa p02 = em.find(Pessoa.class, 2);
		//Printar na tela
		System.out.println("\n"+p02+"\n--------------");
		
		//Pesquisar pessoa no banco passando o nome da class e o .class
		Pessoa p03 = em.find(Pessoa.class, 3);
		//Printar na tela
		System.out.println("\n"+p03);
		
		//Confirmar as alterções que eu fiz
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Pronto!!! ");
	}
}