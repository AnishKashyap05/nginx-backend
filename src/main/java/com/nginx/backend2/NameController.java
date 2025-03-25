package com.nginx.backend2;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class NameController {

    @GetMapping("/getFullName")
    public Map<String, String> getFullName() {
        return Map.of("fullName", "John Doe");
    }
}

