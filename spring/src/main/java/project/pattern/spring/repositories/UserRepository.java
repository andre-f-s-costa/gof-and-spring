package project.pattern.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.pattern.spring.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
