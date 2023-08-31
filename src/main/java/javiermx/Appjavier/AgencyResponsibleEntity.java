package javiermx.Appjavier;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @NoArgsConstructor @Getter @Setter
public class AgencyResponsibleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agencyId;

    private String agencyResponsible;

    @ManyToOne
    @JoinColumn(name = "jurisdiction_id")
    private JurisdictionEntity jurisdiction;

    }
