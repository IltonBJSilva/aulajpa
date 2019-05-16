package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null,"Ezequiel Santana", "EzeAna@gmail.com");
		Pessoa p2 = new Pessoa(null, "Fabio mello", "famello@gmail.com");
		Pessoa p3 = new Pessoa(null,"Elian morais", "Elimorais@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Iniciar a transação
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		//Confirmar as alterções que eu fiz
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Pronto!!! ");

	}

}
