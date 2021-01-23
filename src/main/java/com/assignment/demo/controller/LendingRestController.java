package com.assignment.demo.controller;

import com.assignment.demo.model.Lending;
import com.assignment.demo.service.LendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class LendingRestController {

    @Autowired
    private LendingService lendingService;

    @GetMapping("lendings")
    public List<Lending> getLendings(){
        return lendingService.findAll();
    }

    @PostMapping("create-lending")
    public Lending createBook(@RequestBody Lending lending) {
        return lendingService.createLending(lending);
    }

    @PutMapping("update-lending")
    public Lending updateBook(@RequestBody Lending lending, @RequestParam Long id){
        return lendingService.updateLending(lending, id);
    }
}
