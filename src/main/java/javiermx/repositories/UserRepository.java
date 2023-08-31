package javiermx.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javiermx.Appjavier.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // Add custom query methods if needed
}
