import model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("jpa-lab3-aula");

        EntityManager em = emf.createEntityManager();

        Produto p = new Produto();
        p.setName("Tenis");
        p.setDescription("Tenis de corrida");

        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        Produto produto = em.find(Produto.class, 1);
        System.out.println(produto.toString());
        em.close();
        emf.close();
    }
}
