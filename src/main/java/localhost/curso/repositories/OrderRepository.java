package localhost.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import localhost.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
