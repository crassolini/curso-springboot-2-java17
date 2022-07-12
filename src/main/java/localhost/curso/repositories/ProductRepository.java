package localhost.curso.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import localhost.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
