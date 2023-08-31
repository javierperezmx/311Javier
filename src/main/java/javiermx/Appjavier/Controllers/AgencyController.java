package javiermx.Appjavier.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javiermx.Appjavier.AgencyEntity;
import javiermx.Appjavier.service.AgencyService;

import java.util.List;

@RestController
@RequestMapping("/agencies")
public class AgencyController {
    private final AgencyService agencyService;

    @Autowired
    public AgencyController(AgencyService agencyService) {
        this.agencyService = agencyService;
    }

    @GetMapping
    public List<AgencyEntity> getAllAgencies() {
        return agencyService.getAllAgencies();
    }

    @GetMapping("/{id}")
    public AgencyEntity getAgencyById(@PathVariable Long id) {
        return agencyService.getAgencyById(id);
    }

    @PostMapping
    public AgencyEntity createAgency(@RequestBody AgencyEntity agency) {
        return agencyService.createAgency(agency);
    }

    // Add other endpoints as needed
}
