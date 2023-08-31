package javiermx.Appjavier.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javiermx.Appjavier.AgencyEntity;
import javiermx.Appjavier.AgencyResponsibleEntity;
import javiermx.repositories.AgencyRepository;

import java.util.List;

@Service
public class AgencyResponsibleService {
    private final AgencyRepository agencyResponsibleRepository;

    @Autowired
    public AgencyResponsibleService(AgencyRepository agencyResponsibleRepository) {
        this.agencyResponsibleRepository = agencyResponsibleRepository;
    }

    public List<AgencyEntity> getAllAgencyResponsibles() {
        return agencyResponsibleRepository.findAll();
    }

    public AgencyEntity getAgencyResponsibleById(Long agencyId) {
        return agencyResponsibleRepository.findById(agencyId).orElse(null);
    }

    public AgencyResponsibleEntity createAgencyResponsible(AgencyResponsibleEntity agencyResponsible) {
        return agencyResponsibleRepository.save(agencyResponsible);
    }

    
}
