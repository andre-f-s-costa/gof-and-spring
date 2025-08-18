package project.pattern.spring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.pattern.spring.models.User;
import project.pattern.spring.services.UserSevice;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@CrossOrigin(origins = "*")
public class UserController {

    private final UserSevice userSevice;

    public UserController(UserSevice userSevice) {
        this.userSevice = userSevice;
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userSevice.get());
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable Integer id) {
        try{
            User user = userSevice.getById(id);
            if(user == null){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(user);
        }catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @PostMapping()
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        try{
            userSevice.create(user);
            return ResponseEntity.ok("created successfully");
        }catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable Integer id, @RequestBody User user) {
        try{
            boolean updated = userSevice.update(id, user);
            if (!updated){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok("updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable Integer id) {
        try{
            boolean deleted = userSevice.delete(id);
            if (!deleted){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.noContent().build();
        }catch (Exception e){
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }
}
