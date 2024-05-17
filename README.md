
<h3>Compte Rendu Projet Banking </h3>
<p>
On considère le schéma suivant :<br>
<div style="text-align: center;"><img src="assets/img.png"></div>

<h3>Part 1</h3>
1. <h4>Création des Entités</h4>
    AccountOperation:
    <div style="text-align: center;"><img src="assets/Class_AccountOp.PNG"></div><br>
    BankAccount:
    <div style="text-align: center;"><img src="assets/BankAccount_SingleTable.PNG"></div><br>
    CurrentAccount:
    <div style="text-align: center;"><img src="assets/Class_CurrentAcc.PNG"></div><br>
    SavingAccount:
    <div style="text-align: center;"><img src="assets/Class_SavingAcc.PNG"></div><br>
    Customer:
    <div style="text-align: center;"><img src="assets/Class_Customer.PNG"></div><br>
    
2. <h4>Création des Enumérations</h4>
   AccountStatus:<br>
    <div style="text-align: center;"><img src="assets/Enum_AccStatus.PNG"></div><br>
   OperationType:<br>
    <div style="text-align: center;"><img src="assets/Enum_OpType.PNG"></div><br>

3. <h4>Création des Repositories</h4>
   AccountOperationRepository:
    <div style="text-align: center;"><img src="assets/AccountRepo.PNG"></div><br>
   BankAccountRepository:
    <div style="text-align: center;"><img src="assets/BankAccount_Repo.PNG"></div><br>
   CustomerRepository:
    <div style="text-align: center;"><img src="assets/CustomerRepo.PNG"></div><br>
    
4. <h4>Configurer l'unité de persistance dans le ficher application.properties</h4>
<div style="text-align: center;"><img src="assets/h2settings.PNG"></div><br>
    Résultat:
   <div style="text-align: center;"><img src="assets/h2bank.PNG"></div><br>
   <div style="text-align: center;"><img src="assets/h2bankDB.PNG"></div><br>



5. <h4>Ajout des Customers</h4>
<div style="text-align: center;"><img src="assets/CustomerH2.PNG"></div><br>
Résultat :
<div style="text-align: center;"><img src="assets/Customerh2BD.PNG"></div><br>

6. <h4>l'Ajout des comptes pour chaque Customer</h4>
<div style="text-align: center;"><img src="assets/accountsH2.PNG"></div></br>
Résultat:
<div style="text-align: center;"><img src="assets/accountsh2BD2.PNG"></div>

7. <h4>Ajout des Opérations pour chaque compte</h4>
<div style="text-align: center;"><img src="assets/operationh2.PNG"></div>
Resultat :
<div style="text-align: center;"><img src="assets/operationh2BD2.PNG"></div>

8. <h4>Mapping et Stratégies</h4>
      Single_Table :<br>
      <div style="text-align: center;"><img src="assets/BankAccount_SingleTable.PNG"></div>
      Resultat :
      <div style="text-align: center;"><img src="assets/accountsh2BD2.PNG"></div><br>

      Table_Per_Class :
      <div style="text-align: center;"><img src="assets/BankAccount_TablePerClass.PNG"></div><br>
      Résultat :
      <div style="text-align: center;"><img src="assets/currentaccount.PNG"></div>
      <div style="text-align: center;"><img src="assets/savingAccount.PNG"></div><br>

      Joined_Table :
      <div style="text-align: center;"><img src="assets/BankAccount_Joined.PNG"></div><br>
      Résultat :
      <div style="text-align: center;"><img src="assets/currentAccount_Joined.PNG"></div>
      <div style="text-align: center;"><img src="assets/savingAccount_Joined.PNG"></div>
   
   
9. <h4>Migrer de H2 Database vers MySQL</h4>
      application.properties :
      <div style="text-align: center;"><img src="assets/h2toSQL.PNG"></div>
      <div style="text-align: center;"><img src="assets/MySQLBD.PNG"></div> <br>


<h3>Part 2</h3>
1. <h4>Création des Exceptions</h4>
   BalanceNotSufficientException :
   <div style="text-align: center;"><img src="assets/Exception_Balance.PNG"></div><br>
   BankAccountNotFoundException :
   <div style="text-align: center;"><img src="assets/Exception_BankAcc.PNG"></div><br>
   CustomerNotFoundException :
   <div style="text-align: center;"><img src="assets/Exception_Customer.PNG"></div>

2. <h4>Création des Services</h4>
   BankAccountService Interface :
   <div style="text-align: center;"><img src="assets/BankAccService.PNG"></div><br>
   BankAccountServiceImpl <br>
   - saveCustomer :
   <div style="text-align: center;"><img src="assets/BankAccServImp_SaveCust.PNG"></div><br>
   - saveCurrentBankAccount :
   <div style="text-align: center;"><img src="assets/BankAccServImp_SaveCurrBankAcc.PNG"></div><br>
   - saveSavingBankAccount :
   <div style="text-align: center;"><img src="assets/BankAccServImp_SaveSavBankAcc.PNG"></div><br>
   - listCustomers & getBankAccount :
   <div style="text-align: center;"><img src="assets/BankAccServImp_ListCust&getBankAcc.PNG"></div><br>
   - debit :
   <div style="text-align: center;"><img src="assets/BankAccServImp_debit.PNG"></div><br>
   - credit :
   <div style="text-align: center;"><img src="assets/BankAccServImp_credit.PNG"></div><br>
   - transfer & bankAccountList :
   <div style="text-align: center;"><img src="assets/BankAccServImp_transfer&ListBankAcc.PNG"></div>
   
3. <h4>Ajouter des Customers, comptes et des opérations</h4>
   <div style="text-align: center;"><img src="assets/Application_Bank1.PNG"></div>
   Modification BD :
   <div style="text-align: center;"><img src="assets/Create_AppPropertie.PNG"></div>
   Résultat:
   <div style="text-align: center;"><img src="assets/MySQL_Customer.PNG"></div>
   <div style="text-align: center;"><img src="assets/MySQL_BankAcc.PNG"></div>
   <div style="text-align: center;"><img src="assets/MySQL_AccOp.PNG"></div>

4. <h4>Ajouter Couche Web</h4>
   <div style="text-align: center;"><img src="assets/Web_CustController.PNG"></div>
   Résultat:
   <div style="text-align: center;"><img src="assets/Result_CustContro.PNG"></div>
   Ajouter Annotation JSON:
   <div style="text-align: center;"><img src="assets/Customer_JsonAnnot.PNG"></div>
   Résultat:<br>
   <div style="text-align: center;"><img src="assets/Result_CustControJSON.PNG"></div>
   
5. <h4>Ajout des DTOs</h4>
   AccountHistoryDTO :
   <div style="text-align: center;"><img src="assets/DTO_AccHistory.PNG"></div>
   AccountOperationDTO :
   <div style="text-align: center;"><img src="assets/DTO_AccOp.PNG"></div>
   BankAccountDTO :
   <div style="text-align: center;"><img src="assets/DTO_BankAcc.PNG"></div>
   CreditDTO :
   <div style="text-align: center;"><img src="assets/DTO_Credit.PNG"></div>
   CurrentBankAccountDTO :
   <div style="text-align: center;"><img src="assets/DTO_CurrBankAcc.PNG"></div>
   CustomerDTO :
   <div style="text-align: center;"><img src="assets/DTO_Customer.PNG"></div>
   DebitDTO :
   <div style="text-align: center;"><img src="assets/DTO_Debit.PNG"></div>
   SavingBankAccountDTO :
   <div style="text-align: center;"><img src="assets/DTO_SavBankAcc.PNG"></div>
   TransferRequestDTO :
   <div style="text-align: center;"><img src="assets/DTO_Transfer.PNG"></div>

6. <h4>Modification de la couche Service</h4>
   BankAccountService Interface :
   <div style="text-align: center;"><img src="assets/Service_DTO.PNG"></div>
   <div style="text-align: center;"><img src="assets/Service_DTO2.PNG"></div><br>

   BankAccountServiceImpl 
   - saveCurrentBankAccount :
   <div style="text-align: center;"><img src="assets/ImplDTO_CurrBankAcc.PNG"></div><br>
   - getAccountHistory :
   <div style="text-align: center;"><img src="assets/ImplDTO_getAccHist.PNG"></div><br>
   - bankAccountList & getCustomer :
   <div style="text-align: center;"><img src="assets/ImplDTO_listBankAcc&getCust.PNG"></div><br>
   - listCustomers & getBankAccount :
   <div style="text-align: center;"><img src="assets/ImplDTO_listCust&getBankAcc.PNG"></div><br>
   - saveSavingBankAccount :
   <div style="text-align: center;"><img src="assets/ImplDTO_SavBankAcc.PNG"></div><br>
   - saveCustomer :
   <div style="text-align: center;"><img src="assets/ImplDTO_SaveCust.PNG"></div><br>
   - updateCustomer & deleteCustomer & accountHistory :
   <div style="text-align: center;"><img src="assets/ImplDTO_Upd&delete&AccHist.PNG"></div><br>

7. <h4> Création des Mappers</h4>
   fromCustomer :
   <div style="text-align: center;"><img src="assets/Mapper_Customer.PNG"></div><br>
   fromSavingBankAccount :
   <div style="text-align: center;"><img src="assets/Mapper_SavingBankAcc.PNG"></div><br>
   fromCurrentBankAccount :
   <div style="text-align: center;"><img src="assets/Mapper_CurrentBankAcc.PNG"></div><br>
   fromAccountOperation :
   <div style="text-align: center;"><img src="assets/Mapper_AccOp.PNG"></div><br>

8. <h4>Modification de la couche Web</h4>
   CustomerRestController :
   <div style="text-align: center;"><img src="assets/WebII_CustomerRestController.PNG"></div><br>

   BankAccountRestAPI :
   <div style="text-align: center;"><img src="assets/WebII_BankAccountRestAPI.PNG"></div>
   <div style="text-align: center;"><img src="assets/WebII_BankAccountRestAPII.PNG"></div> 

9. <h4>Ajout de Swagger UI pour afficher le résultat du backend</h4>
   Ajout de la Dépendance :
   <div style="text-align: center;"><img src="assets/Swagger_depend.PNG"></div><br>

   Afficher le résultat :
   <div style="text-align: center;"><img src="assets/Swagger_depend2.PNG"></div>
   <div style="text-align: center;"><img src="assets/Swagger_depend3.PNG"></div>
   <div style="text-align: center;"><img src="assets/Swagger_bankAcc.PNG"></div>
   <div style="text-align: center;"><img src="assets/Swagger_bankAcc2.PNG"></div>

   
   
