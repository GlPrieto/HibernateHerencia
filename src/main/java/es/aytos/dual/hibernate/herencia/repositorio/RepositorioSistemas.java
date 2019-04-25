package es.aytos.dual.hibernate.herencia.repositorio;

import org.hibernate.Session;

import es.aytos.dual.hibernate.herencia.modelo.Sistemas;
import es.aytos.dual.hibernate.herencia.util.HibernateUtil;

public class RepositorioSistemas {

	public static void crearEmpleadoSistema(final Sistemas sistema) {
		final Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
		try {

			sesion.beginTransaction();
			sesion.save(sistema);
			sesion.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Se ha producido un error al crear al empleado");
			sesion.getTransaction().rollback();
			throw new RuntimeException();
		} finally {
			sesion.close();
		}

	}

}
