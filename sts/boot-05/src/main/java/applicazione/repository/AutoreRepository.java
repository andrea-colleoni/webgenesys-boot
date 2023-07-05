package applicazione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import applicazione.model.Autore;

public interface AutoreRepository extends JpaRepository<Autore, String> {

}
