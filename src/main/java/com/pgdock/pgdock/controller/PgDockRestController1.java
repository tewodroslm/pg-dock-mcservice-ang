package com.pgdock.pgdock.controller;

import com.pgdock.pgdock.dto.PgDto1;
import com.pgdock.pgdock.service.PgService1;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class PgDockRestController1 {

    public PgDockRestController1(PgService1 pgService1) {
        this.pgService1 = pgService1;
    }

    PgService1 pgService1;


    @GetMapping("")
    public String hello(){
        return "Hello Docker Sp with multiple cont \n";
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public PgDto1 create(@RequestBody PgDto1 pgDto1){
        PgDto1 pgDto11 = pgService1.create(pgDto1);
        return pgDto11;
    }

    @GetMapping("/get")
    public List<PgDto1> get(){
        return pgService1.get();
    }
}
