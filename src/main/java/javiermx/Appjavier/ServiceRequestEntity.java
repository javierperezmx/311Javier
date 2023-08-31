package javiermx.Appjavier;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity @NoArgsConstructor @Getter @Setter
public class ServiceRequestEntity {
    @Id
    private String serviceRequestId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private String description;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private StatusEntity status;
    private LocalDate requestedAt;
    private String address;
    private String email;

 
    }