package com.gossip.catinfo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api")
public class MyController
{
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("cats")
    public ResponseEntity<Cat> catInfo(){
        RestTemplate temp = new RestTemplate();
        Cat cat = temp.getForObject("https://catfact.ninja/fact", Cat.class);
        return new ResponseEntity<>(cat, HttpStatus.OK);
    }
}
