package applicazione.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import applicazione.model.Libro;

@Repository // non sarebbe necessaria
public interface LibroRepository extends JpaRepository<Libro, String> {

}
