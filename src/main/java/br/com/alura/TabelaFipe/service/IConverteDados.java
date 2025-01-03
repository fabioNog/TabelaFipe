package br.com.alura.TabelaFipe.service;

public interface IConverteDados {
    <T> T obterDados(String Json, Class<T> classe);
}
