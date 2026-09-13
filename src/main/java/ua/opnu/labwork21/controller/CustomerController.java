package ua.opnu.labwork21.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.opnu.labwork21.entity.Customer;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping
    public ResponseEntity<List<Customer>> getAll() {
        return ResponseEntity.ok(List.of(
                new Customer(1L,"Ivan","Ivanov","a@gmail.com","123")
        ));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getById(@PathVariable Long id) {
        return ResponseEntity.ok(new Customer(id,"Test","User","test@gmail.com","000"));
    }
}