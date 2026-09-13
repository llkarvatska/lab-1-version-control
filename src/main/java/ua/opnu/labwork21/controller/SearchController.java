package ua.opnu.labwork21.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/search")
public class SearchController {

    @GetMapping("/products")
    public ResponseEntity<String> searchProducts() {
        return ResponseEntity.ok("Search products OK");
    }
}