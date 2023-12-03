package br.jus.tjms.primefaces.controller;

import br.jus.tjms.primefaces.entidade.Servidor;
import br.jus.tjms.primefaces.entidade.TipoServidor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.faces.bean.ViewScoped;

@Component
@ViewScoped
public class ServidorBean {

    private Servidor servidor;

    public ServidorBean() {
        this.servidor = new Servidor();
    }

    public Servidor getServidor() {
        return servidor;
    }

    public TipoServidor[] getTiposServidor() {
        return TipoServidor.values();
    }
}
