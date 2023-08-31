package javiermx.Appjavier;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @NoArgsConstructor @Getter @Setter
public class AgencyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agencyId;

    private String name;
    private String email;
    private String phone;
    private String passwordHash;

    @ManyToOne
    @JoinColumn(name = "jurisdiction_id")
    private JurisdictionEntity jurisdiction;
    @ManyToMany
    @JoinTable(
    		name = "agency_services", 
    		  joinColumns = @JoinColumn(name = "agency_id"), 
    		  inverseJoinColumns = @JoinColumn(name = "service_id"))
    private Set<ServiceEntity> agentservices;


}
