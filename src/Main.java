import model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("jpa-lab3-aula");
        EntityManager em = entityManagerFactory.createEntityManager();
        Produto produto = new Produto();
        produto.setName("Tenis");
        produto.setDescription("Tenis de corrida");
        em.persist(produto);
        Produto produto1 = em.find(Produto.class, new Produto());
        System.out.println(produto1);
        em.close();
    }
}
