package ma.emsi.banking.Repositories;

import ma.emsi.banking.Entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}