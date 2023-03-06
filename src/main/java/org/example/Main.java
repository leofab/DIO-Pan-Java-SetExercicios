package org.example;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> conj = new LinkedHashSet<>();

        conj.add("vermelha");
        conj.add("laranja");
        conj.add("amarela");
        conj.add("verde");
        conj.add("azul");
        conj.add("azul-escuro");
        conj.add("violeta");

        System.out.println(conj);

        // Exiba todas as cores uma abaixo da outra

        Iterator<String> iterate = conj.iterator();

        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        // A quantidade de cores que o arco-íris tem

        System.out.println(conj.size());

        // Exiba as cores na ordem inversa que foi informada


    }
}