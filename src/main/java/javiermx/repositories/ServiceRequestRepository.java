package javiermx.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javiermx.Appjavier.ServiceRequestEntity;

@Repository
public interface ServiceRequestRepository extends JpaRepository<ServiceRequestEntity, String> {
    // Add custom query methods if needed
}