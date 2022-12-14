package team.secondproject.userservice.controller;

import org.springframework.web.bind.annotation.*;
import team.secondproject.userservice.model.Customer;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

//    @Autowired
//    private CustomerService customerService;

    private List<Customer> customers = Arrays.asList(
         new Customer(1, "Bobbb", "Bob", "Dylan", "iowjueio"),
            new Customer(2, "Mariamm", "Maria", "Parak", "jhwh78kjh"),
            new Customer(3, "G7toc", "Giannhs", "Pantelias", "jkwhgw78w"),
            new Customer(4, "Dellok", "Ment", "Zerk", "vskjfhs787")
    );

    //TODO Tested & Working
    @PostMapping("/createUser")
    public Customer createCustomer(@RequestBody Customer customer){
        System.out.println("inside createCustomer in CustomerController");
        System.out.println(customer.toString());
        customers.add(customer);
        return customer;
//        return customerService.createCustomer(customer);
    }

    @PostMapping("/loginUser")
    public Customer loginUser(@RequestBody Customer customer){
        System.out.println("inside createCustomer in CustomerController");
        System.out.println(customer.toString());
        return customer;
    }

//    //TODO Tested & Working
//    @PostMapping("/addlist")
//    public List<Customer> createListCustomers(@RequestBody List<Customer> customers){
//        System.out.println("inside createSeveralCustomers in CustomerController");
//        System.out.println(customers.toString());
//        return customerService.createListCustomers(customers);
//    }
//
//    //TODO Tested & Working
//    @GetMapping("/{id}")
//    public Customer findCustomerById(@PathVariable("id") Integer customerId){
//        System.out.println("inside findCustomerById in CustomerController");
//        return customerService.findCustomerById(customerId);
//    }
//
//    //TODO Tested & Working
//    @GetMapping("/list")
//    public List<Customer> findAllCustomers(){
//        System.out.println("inside findAllCustomers in CustomerController");
//        return customerService.findAllCustomers();
//    }
//
//    //TODO Tested & Working
//    @PutMapping("/update")
//    public Customer updateCustomer(@RequestBody Customer customer){
//        System.out.println("inside updateCustomer in CustomerController");
//        return customerService.updateCustomer(customer);
//    }
//
//    //TODO Tested & Working
//    @DeleteMapping("/delete/{id}")
//    public String deleteCustomer(@PathVariable("id") Integer customerId){
//        System.out.println("inside deleteCustomer in CustomerController");
//        return customerService.deleteCustomer(customerId);
//    }
}
