package ua.opnu.labwork21.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Orders OK");
    }
}