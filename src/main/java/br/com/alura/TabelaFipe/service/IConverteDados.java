package br.com.alura.TabelaFipe.service;

import java.util.List;

public interface IConverteDados {
    <T> T obterDados(String Json, Class<T> classe);

    <T> List<T> obeterLista(String json, Class<T> classe);
}
