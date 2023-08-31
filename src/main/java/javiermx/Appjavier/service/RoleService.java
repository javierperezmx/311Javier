package javiermx.Appjavier.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javiermx.Appjavier.RoleEntity;
import javiermx.repositories.RoleRepository;

import java.util.List;

@Service
public class RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }

    public RoleEntity getRoleById(Long roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }

    public RoleEntity createRole(RoleEntity role) {
        return roleRepository.save(role);
    }

    // Add other methods as needed for business logic
}
