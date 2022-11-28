package team.secondproject.accountservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.secondproject.accountservice.model.Account;

import java.util.List;

//@Service
public class AccountService {

//    @Autowired
//    private AccountRepository accountRepository;
//
//    public Account openAccount(Account account) {
//        System.out.println("inside createAccount in AccountService");
//        return accountRepository.save(account);
//    }
//
//    public List<Account> openListAccounts(List<Account> accounts) {
//        System.out.println("inside createListAccounts in AccountService");
//        return accountRepository.saveAll(accounts);
//    }
//
//    public Account findAccountById(Integer accountId) {
//        System.out.println("inside findAccountById in AccountService");
//        return accountRepository.findById(accountId).orElse(null);
//    }
//
//    public List<Account> findAllAccounts() {
//        System.out.println("inside findAllAccounts in AccountService");
//        return accountRepository.findAll();
//    }
//
//    //TODO check if balance account should be changed in this method OR ONLY the owner of it (User ID)
//    public Account updateAccount(Account account) {
//        System.out.println("inside findAllAccounts in AccountService");
//        Account existentAccount = accountRepository.findById(account.getAccountId()).orElse(null);
//        if(existentAccount != null) {
////            existentAccount.setUserId(account.getUserId());
//            //existentAccount.setBalance(account.getBalance());
//            return accountRepository.save(existentAccount);
//        }
//        return account;
//    }
//
//    public String deleteAccount(Integer accountId) {
//        accountRepository.deleteById(accountId);
//        return "Account deleted successfully";
//    }
}

