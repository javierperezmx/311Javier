package javiermx.Appjavier.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javiermx.Appjavier.ServiceRequestEntity;
import javiermx.repositories.ServiceRequestRepository;

import java.util.List;

@Service
public class ServiceRequestService {
    private final ServiceRequestRepository requestRepository;

    @Autowired
    public ServiceRequestService(ServiceRequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<ServiceRequestEntity> getAllServiceRequests() {
        return requestRepository.findAll();
    }

    public ServiceRequestEntity getServiceRequestById(String requestId) {
        return requestRepository.findById(requestId).orElse(null);
    }

    public ServiceRequestEntity createServiceRequest(ServiceRequestEntity request) {
        return requestRepository.save(request);
    }

    // Add other methods as needed for business logic
}
