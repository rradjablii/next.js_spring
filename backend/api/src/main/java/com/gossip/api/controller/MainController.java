package com.gossip.api.controller;

import com.gossip.api.item.ResponseItem;
import com.gossip.api.service.ItemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class MainController {

    private final ItemServiceImpl service;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("items")
    public ResponseEntity<ArrayList<ResponseItem>> getItems(){
        return new ResponseEntity<>(service.getRandomItems(), HttpStatus.OK);
    }

}
