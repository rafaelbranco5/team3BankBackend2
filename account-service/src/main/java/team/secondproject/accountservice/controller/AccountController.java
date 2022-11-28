package team.secondproject.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.secondproject.accountservice.model.Account;
import team.secondproject.accountservice.service.AccountService;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private List<Account> accounts = Arrays.asList(
            new Account(1, 1, "Hark 1", 220),
            new Account(2, 1, "Aop Bank", 120),
            new Account(3, 2, "Lorem Ipsum", 420),
            new Account(4, 3, "Ipsom", 520)
    );


    //TODO Tested & Working
    //@RequestBody maps the httpRequest body to transfer data onto a Java object (deserializes the JSON into a Java type)
    @PostMapping("/open")
    public Account openAccount(@RequestBody Account account) {
        System.out.println("inside createAccount in AccountController");
        System.out.println(account.toString());
        //return accountService.openAccount(account);
        return account;
    }

    @GetMapping("/{id}")
    public List<Account> retreiveCustomerAccounts(@PathVariable int id){
//        return Arrays.asList(new Account(4, 3, "Ipsom", 520));
        return accounts.stream().filter(acc -> acc.getCustomerId() == id).collect(Collectors.toList());
    }

    //TODO Tested & Working
//    @PostMapping("/openaccounts")
//    public List<Account> openListAccounts(@RequestBody List<Account> accounts){
//        System.out.println("inside createListAccounts in AccountController");
//        System.out.println(accounts.toString());
////        return accountService.openListAccounts(accounts);
//    }
//
//    //TODO Tested & not working properly, need to be connected to customer
//    @GetMapping("/{id}")
//    public Account findAccountById(@PathVariable("id") Integer accountId){
//        System.out.println("inside findAccountById in AccountController");
//        return accountService.findAccountById(accountId);
//    }
//
//    //TODO Tested & not working properly, need to be connected to customer
//    @GetMapping("/list")
//    public List<Account> findAllAccounts(){
//        System.out.println("inside findAllAccounts in AccountController");
//        return accountService.findAllAccounts();
//    }
//
//    //TODO check if this method should exist -not working properly, need to be connected to customer
//    @PutMapping("/update")
//    public Account updateAccount(@RequestBody Account account){
//        System.out.println("inside updateAccount in AccountController");
//        return accountService.updateAccount(account);
//    }
//
//    //TODO Tested & Working
//    @DeleteMapping("/delete/{id}")
//    public String deleteAccount(@PathVariable("id") Integer accountId){
//        System.out.println("inside deleteAccount in AccountController");
//        return accountService.deleteAccount(accountId);
//    }
}
