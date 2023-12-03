package br.jus.tjms.primefaces.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.faces.bean.ViewScoped;

@Component
@RequestScope
public class ServidorBean {

    private static Integer NUMERO = 0;

    public ServidorBean() {
        NUMERO++;
    }

    public Integer getNumero() {
        return NUMERO;
    }
}
