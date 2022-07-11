package localhost.curso.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import localhost.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
