package br.jus.tjms.primefaces.service;

import br.jus.tjms.primefaces.entidade.Servidor;
import br.jus.tjms.primefaces.repository.ServidorRepository;
import org.springframework.stereotype.Service;

@Service
public class ServidorService {
    private final ServidorRepository servidorRepository;

    public ServidorService(ServidorRepository servidorRepository) {
        this.servidorRepository = servidorRepository;
    }
    public void gravar(Servidor servidor) {
        servidorRepository.save(servidor);
    }

}
