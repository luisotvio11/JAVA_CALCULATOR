package br.com.devnetserra;


@FunctionalInterface
public interface MemoriaObservador {

	public void valorAlterado(String novoValor);
}