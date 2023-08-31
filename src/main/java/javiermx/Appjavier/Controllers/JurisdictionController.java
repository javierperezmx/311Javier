package javiermx.Appjavier.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javiermx.Appjavier.JurisdictionEntity;
import javiermx.Appjavier.service.JurisdictionService;

import java.util.List;

@RestController
@RequestMapping("/jurisdictions")
public class JurisdictionController {
    private final JurisdictionService jurisdictionService;

    @Autowired
    public JurisdictionController(JurisdictionService jurisdictionService) {
        this.jurisdictionService = jurisdictionService;
    }

    @GetMapping
    public List<JurisdictionEntity> getAllJurisdictions() {
        return jurisdictionService.getAllJurisdictions();
    }

    @GetMapping("/{id}")
    public JurisdictionEntity getJurisdictionById(@PathVariable Long id) {
        return jurisdictionService.getJurisdictionById(id);
    }

    @PostMapping
    public JurisdictionEntity createJurisdiction(@RequestBody JurisdictionEntity jurisdiction) {
        return jurisdictionService.createJurisdiction(jurisdiction);
    }

    // Add other endpoints as needed
}
