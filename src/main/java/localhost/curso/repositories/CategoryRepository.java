package localhost.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import localhost.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
