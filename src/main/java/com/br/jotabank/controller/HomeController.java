package com.br.jotabank.controller;

import com.br.jotabank.service.HomeService;
import com.br.jotabank.to.ExtratoTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService service;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/extrato")
    public List<ExtratoTO> obterExtrato() {
        return this.service.obterExtrato();
    }
}
