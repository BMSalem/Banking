
<h3>Compte Rendu Projet Banking </h3>
<p>
On considère le schéma suivant :<br>
<center><img src="assets/img.png"></center>

<h3>Part 1</h3>
1. <h4>Création des Entités</h4>
    AccountOperation:
    <center><img src="assets/Class_AccountOp.PNG"></center><br>
    BankAccount:
    <center><img src="assets/BankAccount_SingleTable.PNG"></center><br>
    CurrentAccount:
    <center><img src="assets/Class_CurrentAcc.PNG"></center><br>
    SavingAccount:
    <center><img src="assets/Class_SavingAcc.PNG"></center><br>
    Customer:
    <center><img src="assets/Class_Customer.PNG"></center><br>
    
2. <h4>Création des Enumérations</h4>
   AccountStatus:
    <center><img src="assets/Enum_AccStatus.PNG"></center><br>
   OperationType:
    <center><img src="assets/Enum_OpType.PNG"></center><br>

3. <h4>Création des Repositories</h4>
   AccountOperationRepository:
    <center><img src="assets/AccountRepo.PNG"></center><br>
   BankAccountRepository:
    <center><img src="assets/BankAccount_Repo.PNG"></center><br>
   CustomerRepository:
    <center><img src="assets/CustomerRepo.PNG"></center><br>
    
4. <h4>Configurer l'unité de persistance dans le ficher application.properties</h4>
<center><img src="assets/h2settings.PNG"></center><br>
    Résultat:
   <center><img src="assets/h2bank.PNG"></center><br>
   <center><img src="assets/h2bankDB.PNG"></center><br>



5. <h4>Ajout des Customers</h4>
<center><img src="assets/CustomerH2.PNG"></center><br>
Résultat :
<center><img src="assets/Customerh2BD.PNG"></center><br>

6. <h4>l'Ajout des comptes pour chaque Customer</h4>
<center><img src="assets/accountsH2.PNG"></center></br>
Résultat:
<center><img src="assets/accountsh2BD2.PNG"></center>

7. <h4>Ajout des Opérations pour chaque compte</h4>
<center><img src="assets/operationh2.PNG"></center>
Resultat :
<center><img src="assets/operationh2BD2.PNG"></center>

8. <h4>Mapping et Stratégies</h4>
      Single_Table :
      <center><img src="assets/BankAccount_SingleTable.PNG"></center>
      Resultat :
      <center><img src="assets/accountsh2BD2.PNG"></center><br>

      Table_Per_Class :
      <center><img src="assets/BankAccount_TablePerClass.PNG"></center><br>
      Résultat :
      <center><img src="assets/currentaccount.PNG"></center>
      <center><img src="assets/savingAccount.PNG"></center><br>

      Joined_Table :
      <center><img src="assets/BankAccount_Joined.PNG"></center><br>
      Résultat :
      <center><img src="assets/currentAccount_Joined.PNG"></center>
      <center><img src="assets/savingAccount_Joined.PNG"></center>
   
   
9. <h4>Migrer de H2 Database vers MySQL</h4>
      application.properties :
      <center><img src="assets/h2toSQL.PNG"></center>
      <center><img src="assets/MySQLBD.PNG"></center> <br>


