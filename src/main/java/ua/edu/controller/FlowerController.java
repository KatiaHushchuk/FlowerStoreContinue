package ua.edu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.flower.flower.store.Flower;

@RestController
@RequestMapping("/api/v1")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlower() {
        return List.of();
    }
    
}
