package org.example;

import java.util.*;

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

        System.out.println(conj + "\n");

        // Exiba todas as cores uma abaixo da outra

        Iterator<String> iterate = conj.iterator();

        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }
        System.out.println("\n");

        // A quantidade de cores que o arco-íris tem

        System.out.println(conj.size() + "\n");

        // Exiba as cores na ordem inversa que foi informada

        LinkedList<String> reverseList = new LinkedList<>(conj);

        Iterator<String> reverseIterate = reverseList.descendingIterator();

        while(reverseIterate.hasNext()){
            System.out.println(reverseIterate.next());
        }

        System.out.println("\n");

        // Exiba todas as cores que começam com a letra "v"

        Iterator<String> iterate2 = conj.iterator();

        while(iterate2.hasNext()){
            String letra = iterate2.next();
            char l = letra.charAt(0);
            String compare = Character.toString(l);
            if(compare.compareTo("v") == 0) {
                System.out.println(letra);
            }
        }

        System.out.println("\n");

        // Remova todas as cores que não começam com a letra "v"

        Iterator<String> iterate3 = conj.iterator();

        Set<String> newConj = new LinkedHashSet<>();

        while(iterate3.hasNext()){
            String letra = iterate3.next();
            char l = letra.charAt(0);
            String compare = Character.toString(l);
            if(compare.compareTo("v") != 0) {
                newConj.add(letra);
            }
        }

        System.out.println(newConj);

        System.out.println("\n");

        System.out.println(conj.removeAll(newConj));

        System.out.println("\n");

        System.out.println(conj);

        conj.removeAll(conj);

        System.out.println(conj);

        System.out.println("\n");


        Set<LinguagemFavorita> linguagens = new TreeSet<>(){{
            add(new LinguagemFavorita("Java", 1998, "IntelliJ"));
            add(new LinguagemFavorita("Python", 2007, "Pycharm"));
            add(new LinguagemFavorita("Javascript", 2002, "WebStorm"));
            add(new LinguagemFavorita("C++", 1992, "Notepad++"));
        }};

        Iterator<LinguagemFavorita> iterator4 = linguagens.iterator();

        while(iterator4.hasNext()){
            System.out.println(iterator4.next());
        }

        System.out.println("\n");

        for(LinguagemFavorita ling: linguagens) System.out.println(ling.getNome() + " - " + ling.getAnoDeCriacao() + " - " + ling.getIde());


    }
}