package team.secondproject.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.secondproject.userservice.model.Customer;
import team.secondproject.userservice.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        System.out.println("inside createCustomer in CustomerService");
        return customerRepository.save(customer);
    }

    public List<Customer> createListCustomers(List<Customer> customers) {
        System.out.println("inside createListCustomers in CustomerService");
        return customerRepository.saveAll(customers);
    }

    public Customer findCustomerById(Integer customerId) {
        System.out.println("inside findCustomerById in CustomerService");
        return customerRepository.findById(customerId).orElse(null);
    }

    public List<Customer> findAllCustomers() {
        System.out.println("inside findAllCustomers in CustomerService");
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        System.out.println("inside updateCustomer in CustomerService");
        Customer existentCustomer = customerRepository.findById(customer.getCustomerId()).orElse(null);
        existentCustomer.setUsername(customer.getUsername());
        existentCustomer.setFirstname(customer.getFirstname());
        existentCustomer.setLastname(customer.getLastname());
        existentCustomer.setPassword(customer.getPassword());
        return customerRepository.save(existentCustomer);
    }

    public String deleteCustomer(Integer customerId) {
        customerRepository.deleteById(customerId);
        return "Customer deleted successfully";
    }
}
