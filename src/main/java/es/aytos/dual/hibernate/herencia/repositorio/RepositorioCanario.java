package es.aytos.dual.hibernate.herencia.repositorio;

import org.hibernate.Session;

import es.aytos.dual.hibernate.herencia.modelo.Canario;
import es.aytos.dual.hibernate.herencia.util.HibernateUtil;

public class RepositorioCanario {

	public static void crearCanario(final Canario canario) {
		final Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
		try {

			sesion.beginTransaction();
			sesion.save(canario);
			sesion.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Se ha producido un error al crear al pajaro");
			sesion.getTransaction().rollback();
			throw new RuntimeException();
		} finally {
			sesion.close();
		}

	}
}
