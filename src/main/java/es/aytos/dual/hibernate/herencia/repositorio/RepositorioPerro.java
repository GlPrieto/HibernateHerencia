package es.aytos.dual.hibernate.herencia.repositorio;

import org.hibernate.Session;

import es.aytos.dual.hibernate.herencia.modelo.Perro;
import es.aytos.dual.hibernate.herencia.util.HibernateUtil;

public class RepositorioPerro {

	public static void crearPerro(final Perro perro) {
		final Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
		try {

			sesion.beginTransaction();
			sesion.save(perro);
			sesion.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Se ha producido un error al crear al perro");
			sesion.getTransaction().rollback();
			throw new RuntimeException();
		} finally {
			sesion.close();
		}

	}

}
