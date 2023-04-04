package com.br.jotabank.service;

import com.br.jotabank.to.ExtratoTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    public List<ExtratoTO> obterExtrato() {
        return List.of(new ExtratoTO("1000"), new ExtratoTO("3000"));
    }
}
