package javiermx.Appjavier.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javiermx.Appjavier.RoleEntity;
import javiermx.Appjavier.service.RoleService;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<RoleEntity> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/{id}")
    public RoleEntity getRoleById(@PathVariable Long id) {
        return roleService.getRoleById(id);
    }

    @PostMapping
    public RoleEntity createRole(@RequestBody RoleEntity role) {
        return roleService.createRole(role);
    }

    // Add other endpoints as needed
}
