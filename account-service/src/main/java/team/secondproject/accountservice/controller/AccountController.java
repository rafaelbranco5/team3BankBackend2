package team.secondproject.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.secondproject.accountservice.model.Account;
import team.secondproject.accountservice.service.AccountService;

@RestController
@RequestMapping("user/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    //@RequestBody maps the httpRequest body to transfer data onto a Java object (deserializes the JSON into a Java type)
    @PostMapping("/")
    public Account createAccount(@RequestBody Account account) {
        System.out.println("inside createAccount in AccountController");
        System.out.println(account.toString());
        return accountService.createAccount(account);
    }

}
