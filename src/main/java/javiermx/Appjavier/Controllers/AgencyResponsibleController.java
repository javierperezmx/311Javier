package javiermx.Appjavier.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javiermx.Appjavier.AgencyEntity;
import javiermx.Appjavier.AgencyResponsibleEntity;
import javiermx.Appjavier.service.AgencyResponsibleService;

import java.util.List;

@RestController
@RequestMapping("/agency-responsibles")
public class AgencyResponsibleController {
    private final AgencyResponsibleService agencyResponsibleService;

    @Autowired
    public AgencyResponsibleController(AgencyResponsibleService agencyResponsibleService) {
        this.agencyResponsibleService = agencyResponsibleService;
    }

    @GetMapping
    public List<AgencyEntity> getAllAgencyResponsibles() {
        return agencyResponsibleService.getAllAgencyResponsibles();
    }

    @GetMapping("/{id}")
    public AgencyEntity getAgencyResponsibleById(@PathVariable Long id) {
        return agencyResponsibleService.getAgencyResponsibleById(id);
    }

    @PostMapping
    public AgencyResponsibleEntity createAgencyResponsible(@RequestBody AgencyResponsibleEntity agencyResponsible) {
        return agencyResponsibleService.createAgencyResponsible(agencyResponsible);
    }

    // Add other endpoints as needed
}
