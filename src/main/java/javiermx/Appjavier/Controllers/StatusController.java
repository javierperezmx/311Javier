package javiermx.Appjavier.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javiermx.Appjavier.StatusEntity;
import javiermx.Appjavier.service.StatusService;

import java.util.List;

@RestController
@RequestMapping("/statuses")
public class StatusController {
    private final StatusService statusService;

    @Autowired
    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping
    public List<StatusEntity> getAllStatuses() {
        return statusService.getAllStatuses();
    }

    @GetMapping("/{id}")
    public StatusEntity getStatusById(@PathVariable Long id) {
        return statusService.getStatusById(id);
    }

    @PostMapping
    public StatusEntity createStatus(@RequestBody StatusEntity status) {
        return statusService.createStatus(status);
    }

    // Add other endpoints as needed
}
