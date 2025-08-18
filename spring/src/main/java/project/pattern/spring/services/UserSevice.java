package project.pattern.spring.services;

import org.springframework.stereotype.Service;
import project.pattern.spring.models.User;
import project.pattern.spring.repositories.UserRepository;

import java.util.List;

@Service
public class UserSevice {

    private final UserRepository userRepository;

    public UserSevice(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> get() {
        return userRepository.findAll();
    }

    public void create(User user) {
        userRepository.save(user);
    }

    public Boolean update(Integer id, User user) {
        User updated = userRepository.findById(id).orElse(null);
        if(updated == null){
            return false;
        }
        if (user.getFirstName() != null) {
            if(!user.getFirstName().isBlank()){
                updated.setFirstName(user.getFirstName());
            }
        }
        if (user.getLastName() != null) {
            if(!updated.getLastName().isBlank()){
                updated.setLastName(user.getLastName());
            }
        }
        if (user.getEmail() != null) {
            if(!updated.getEmail().isBlank()){
                updated.setEmail(user.getEmail());
            }
        }
        userRepository.save(updated);
        return true;
    }

    public boolean delete(Integer id) {
        if(getById(id) == null){
            return false;
        }
        userRepository.deleteById(id);
        return true;
    }
}
