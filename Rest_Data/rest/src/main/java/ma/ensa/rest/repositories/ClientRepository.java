package ma.ensa.rest.repositories;

import ma.ensa.rest.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Client c LEFT JOIN FETCH c.comptes WHERE c.id = :id")
    Client findByIdWithComptes(@Param("id") Long id);
}