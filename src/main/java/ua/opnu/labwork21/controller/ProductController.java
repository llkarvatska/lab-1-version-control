package ua.opnu.labwork21.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Products OK");
    }
}