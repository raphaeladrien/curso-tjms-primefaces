package br.jus.tjms.primefaces.controller;

import br.jus.tjms.primefaces.entidade.Servidor;
import br.jus.tjms.primefaces.entidade.TipoServidor;
import br.jus.tjms.primefaces.service.ServidorService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.faces.bean.ViewScoped;

@Component
@ViewScoped
public class ServidorBean {

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
