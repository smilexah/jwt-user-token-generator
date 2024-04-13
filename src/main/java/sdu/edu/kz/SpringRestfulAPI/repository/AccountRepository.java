package sdu.edu.kz.SpringRestfulAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sdu.edu.kz.SpringRestfulAPI.entity.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByEmail(String email);
}
