package javiermx.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javiermx.Appjavier.StatusEntity;

@Repository
public interface StatusRepository extends JpaRepository<StatusEntity, Long> {
    // Add custom query methods if needed
}