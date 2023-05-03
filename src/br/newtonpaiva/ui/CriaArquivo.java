package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.ManipuladorArquivos;

import java.io.IOException;

public class CriaArquivo {
    public static void main(String[] args) throws IOException {
        String nome = "C:/Users/12118482/Documents/Arquivos/nomes.txt";
        String sobrenome = "C:/Users/12118482/Documents/Arquivos/sobrenomes.txt";
        String result = "C:/Users/12118482/Documents/Arquivos/result.txt";

        String[] nomes = ManipuladorArquivos.leitor(nome);
        String[] sobrenomes = ManipuladorArquivos.leitor(sobrenome);

        for (int i=0; i<nomes.length; i++){
            ManipuladorArquivos.escritor(result, nomes[i] + " " + sobrenomes[i]);
        }
    }
}
