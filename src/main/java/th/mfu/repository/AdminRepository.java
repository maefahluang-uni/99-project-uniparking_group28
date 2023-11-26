package th.mfu.repository;

import java.util.List;
import java.util.Optional;

import th.mfu.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    List<Admin> findByAdminID(int adminID);    
    Optional<Admin> findByUsernameAndPassword(String username, String password);


}
