package th.mfu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import th.mfu.model.Admin;
import th.mfu.repository.AdminRepository;

@Service
public class AdminService {

    private static AdminRepository repository;

    private AdminService(AdminRepository repository){
        AdminService.repository = repository;
    }

    public List<th.mfu.model.Admin> findAll(){
        return repository.findAll();
    }

    public List<th.mfu.model.Admin> findByUserId(Integer AdminId){
        return repository.findByAdminID(AdminId);
    }

    public void deleteUser(Integer AdminId){
        repository.deleteById(AdminId);
    }

    public static boolean isValidUser(String username, String password) {
        Optional<Admin> adminOptional = repository.findByUsernameAndPassword(username, password);
        return adminOptional.isPresent();
    }
}
