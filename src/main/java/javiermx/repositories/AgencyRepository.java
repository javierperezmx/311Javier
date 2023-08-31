package javiermx.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javiermx.Appjavier.AgencyEntity;
import javiermx.Appjavier.AgencyResponsibleEntity;

@Repository
public interface AgencyRepository extends JpaRepository<AgencyEntity, Long> {

	AgencyResponsibleEntity save(AgencyResponsibleEntity agencyResponsible);
    // Add custom query methods if needed
}