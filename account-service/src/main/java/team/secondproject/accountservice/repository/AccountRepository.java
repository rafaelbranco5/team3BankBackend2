package team.secondproject.accountservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import team.secondproject.accountservice.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}
