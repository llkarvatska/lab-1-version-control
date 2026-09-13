package ua.opnu.labwork21.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Categories OK");
    }
}