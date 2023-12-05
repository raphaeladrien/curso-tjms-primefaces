package br.jus.tjms.primefaces.controller;

import br.jus.tjms.primefaces.entidade.Servidor;
import br.jus.tjms.primefaces.entidade.TipoServidor;
import br.jus.tjms.primefaces.service.ServidorService;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.validation.Valid;

@Component
@ViewScoped
@Validated
public class ServidorBean {

    @Valid
    private Servidor servidor;
    private final ServidorService servidorService;

    public ServidorBean(ServidorService servidorService) {
        this.servidor = new Servidor();
        this.servidorService = servidorService;
    }

    public void gravar() {
        servidorService.gravar(servidor);
    }

    public String ajudar() {
        return "ajuda-servidor";
    }

    public String servidor() {
        return "servidor";
    }

    public Servidor getServidor() {
        return servidor;
    }

    public TipoServidor[] getTiposServidor() {
        return TipoServidor.values();
    }
}
