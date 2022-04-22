package repository;

import entity.Corso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorsoRepo extends JpaRepository<Corso, Integer>  {
}
