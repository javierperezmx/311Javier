package javiermx.Appjavier.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javiermx.Appjavier.ServiceEntity;
import javiermx.repositories.ServiceRepository;
import java.util.List;

@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;

    @Autowired
    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public List<ServiceEntity> getAllServices() {
        return serviceRepository.findAll();
    }

    public ServiceEntity getServiceById(Long serviceId) {
        return serviceRepository.findById(serviceId).orElse(null);
    }

    public ServiceEntity createService(ServiceEntity service) {
        return serviceRepository.save(service);
    }

    public ServiceEntity updateService(Long serviceId, ServiceEntity updatedService) {
        ServiceEntity existingService = getServiceById(serviceId);
        if (existingService != null) {
            existingService.setServiceCode(updatedService.getServiceCode());
            existingService.setServiceName(updatedService.getServiceName());
            existingService.setDescription(updatedService.getDescription());
            // Set other properties as needed
            return serviceRepository.save(existingService);
        }
        return null;
    }

    public void deleteService(Long serviceId) {
        serviceRepository.deleteById(serviceId);
    }
}
