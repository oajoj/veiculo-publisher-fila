package br.edu.ifpa.veiculospublisher.models.dtos;

import java.io.Serializable;

public class VeiculoDto {

    private Long id;
    private String nome;
    private String marca;
    private Double valor;
    private Integer ano;
    private Long donoId;

    public VeiculoDto() {
    }

    public VeiculoDto(Long id, String nome, String marca, Double valor, Integer ano, Long donoId) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.ano = ano;
        this.donoId = donoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Long getDonoId() {
        return donoId;
    }

    public void setDonoId(Long donoId) {
        this.donoId = donoId;
    }
}
