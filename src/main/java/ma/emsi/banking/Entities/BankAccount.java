package ma.emsi.banking.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.emsi.banking.Enums.AccountStatus;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 4)
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BankAccount {
   @Id
    private String id;
    private double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
   @ManyToOne
    private Customer customer;

   @OneToMany(mappedBy = "bankAccount",fetch = FetchType.LAZY) // Lazy = charge tout les attributs en mémoire sauf ListOperation (on la charge manuellement), Eager = si je charge BankAccount automatiquement tu me charge listAccountOp en mémoire
    private List<AccountOperation> accountOperations;
}
