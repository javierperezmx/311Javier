package javiermx.Appjavier.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javiermx.Appjavier.JurisdictionEntity;
import javiermx.repositories.JurisdictionRepository;

import java.util.List;

@Service
public class JurisdictionService {
    private final JurisdictionRepository jurisdictionRepository;

    @Autowired
    public JurisdictionService(JurisdictionRepository jurisdictionRepository) {
        this.jurisdictionRepository = jurisdictionRepository;
    }

    public List<JurisdictionEntity> getAllJurisdictions() {
        return jurisdictionRepository.findAll();
    }

    public JurisdictionEntity getJurisdictionById(Long jurisdictionId) {
        return jurisdictionRepository.findById(jurisdictionId).orElse(null);
    }

    public JurisdictionEntity createJurisdiction(JurisdictionEntity jurisdiction) {
        return jurisdictionRepository.save(jurisdiction);
    }

    
}
