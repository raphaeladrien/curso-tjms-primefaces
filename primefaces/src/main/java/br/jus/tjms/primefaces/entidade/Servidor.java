package br.jus.tjms.primefaces.entidade;

import java.math.BigDecimal;
import java.util.Date;

public class Servidor {

    private String cpf;
    private String nome;
    private TipoServidor tipoServidor;
    private BigDecimal salario;
    private Date dataAprovacao;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoServidor getTipoServidor() {
        return tipoServidor;
    }

    public void setTipoServidor(TipoServidor tipoServidor) {
        this.tipoServidor = tipoServidor;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Date getDataAprovacao() {
        return dataAprovacao;
    }

    public void setDataAprovacao(Date dataAprovacao) {
        this.dataAprovacao = dataAprovacao;
    }

    @Override
    public String toString() {
        return "Servidor{" +
            "cpf='" + cpf + '\'' +
            ", nome='" + nome + '\'' +
            ", tipoServidor=" + tipoServidor +
            ", salario=" + salario +
            ", dataAprovacao=" + dataAprovacao +
            '}';
    }
}
