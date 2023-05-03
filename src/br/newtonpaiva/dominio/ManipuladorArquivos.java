package br.newtonpaiva.dominio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipuladorArquivos {
    public static String[] leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        List<String> linhas = new ArrayList<>();
        String linha = buffRead.readLine();
        while (true){
            if(linha != null){
                System.out.println(linha);
                linhas.add(linha);
                linha = buffRead.readLine();
            }
            else {
                break;
            }
        }
        buffRead.close();
        return linhas.toArray(new String[0]);
    }

    public static void escritor(String path, String conteudo) throws IOException {
        File file = new File(path);
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        buffWrite.write(conteudo);
        buffWrite.close();
    }
}
