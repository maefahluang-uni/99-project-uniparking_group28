package th.mfu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import th.mfu.model.User;
import th.mfu.repository.UserRepository;

@Service
public class UserService {

    private static UserRepository repository;

    private UserService(UserRepository repository){
        UserService.repository = repository;
    }

    public List<th.mfu.model.User> findAll(){
        return repository.findAll();
    }

    public List<th.mfu.model.User> findByUserId(Integer userId){
        return repository.findByUserID(userId);
    }

    public void deleteUser(Integer userId){
        repository.deleteById(userId);
    }

    public static boolean isValidUser(String username, String password) {
        Optional<User> userOptional = repository.findByUsernameAndPassword(username, password);
        return userOptional.isPresent();
    }
}
