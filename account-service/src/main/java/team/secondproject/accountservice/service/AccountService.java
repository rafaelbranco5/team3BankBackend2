package team.secondproject.accountservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.secondproject.accountservice.model.Account;
import team.secondproject.accountservice.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        System.out.println("inside createAccount in AccountService");
        return accountRepository.save(account);
    }
}
