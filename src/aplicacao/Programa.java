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

		/*
		Não pode fazer dessa forma por que estaria tentando remover alguem que estava destacado
		primeramente precisa ser alguem que esta monitorado
		Pessoa p = new Pessoa(2, null, null);
		em.remove(p);
		*/
		
		//Assim remove a pessoa 2
		Pessoa pessoa = em.find(Pessoa.class, 2);
		em.remove(pessoa);
		
		//Confirmar as alterções que eu fiz
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Pronto!!! ");
	}
}