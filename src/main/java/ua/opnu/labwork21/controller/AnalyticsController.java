package ua.opnu.labwork21.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping("/analytics")
public class AnalyticsController {

    @GetMapping("/products/count")
    public ResponseEntity<String> count() {
        return ResponseEntity.ok("Count OK");
    }
}