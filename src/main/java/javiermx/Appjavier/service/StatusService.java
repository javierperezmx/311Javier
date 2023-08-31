package javiermx.Appjavier.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javiermx.Appjavier.StatusEntity;
import javiermx.repositories.StatusRepository;
	
import java.util.List;

@Service
public class StatusService {
    private final StatusRepository statusRepository;

    @Autowired
    public StatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    public List<StatusEntity> getAllStatuses() {
        return statusRepository.findAll();
    }

    public StatusEntity getStatusById(Long statusId) {
        return statusRepository.findById(statusId).orElse(null);
    }

    public StatusEntity createStatus(StatusEntity status) {
        return statusRepository.save(status);
    }

   
}
