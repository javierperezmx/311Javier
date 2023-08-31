package javiermx.Appjavier.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javiermx.Appjavier.AgencyEntity;
import javiermx.repositories.AgencyRepository;

import java.util.List;

@Service
public class AgencyService {
    private final AgencyRepository agencyRepository;

    @Autowired
    public AgencyService(AgencyRepository agencyRepository) {
        this.agencyRepository = agencyRepository;
    }

    public List<AgencyEntity> getAllAgencies() {
        return agencyRepository.findAll();
    }

    public AgencyEntity getAgencyById(Long agencyId) {
        return agencyRepository.findById(agencyId).orElse(null);
    }

    public AgencyEntity createAgency(AgencyEntity agency) {
        return agencyRepository.save(agency);
    }

   
}
