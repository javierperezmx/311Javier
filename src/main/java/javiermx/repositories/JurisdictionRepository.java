package javiermx.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javiermx.Appjavier.JurisdictionEntity;

@Repository
public interface JurisdictionRepository extends JpaRepository<JurisdictionEntity, Long> {
    // Add custom query methods if needed
}