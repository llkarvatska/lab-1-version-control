package ua.opnu.labwork21.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/order-items")
public class OrderItemController {

    @GetMapping
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("OrderItems OK");
    }
}