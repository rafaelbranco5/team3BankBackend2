package team.secondproject.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.secondproject.userservice.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
