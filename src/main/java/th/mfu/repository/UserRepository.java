package th.mfu.repository;

import java.util.List;
import java.util.Optional;

import th.mfu.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByUserID(int userID);    
    Optional<User> findByUsernameAndPassword(String username, String password);


}
