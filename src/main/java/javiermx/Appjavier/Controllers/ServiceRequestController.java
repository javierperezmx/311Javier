package javiermx.Appjavier.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javiermx.Appjavier.ServiceRequestEntity;
import javiermx.Appjavier.service.ServiceRequestService;

import java.util.List;

@RestController
@RequestMapping("/service-requests")
public class ServiceRequestController {
    private final ServiceRequestService requestService;

    @Autowired
    public ServiceRequestController(ServiceRequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public List<ServiceRequestEntity> getAllServiceRequests() {
        return requestService.getAllServiceRequests();
    }

    @GetMapping("/{id}")
    public ServiceRequestEntity getServiceRequestById(@PathVariable String id) {
        return requestService.getServiceRequestById(id);
    }

    @PostMapping
    public ServiceRequestEntity createServiceRequest(@RequestBody ServiceRequestEntity request) {
        return requestService.createServiceRequest(request);
    }

    // Add other endpoints as needed
}
