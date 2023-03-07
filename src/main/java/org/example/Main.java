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

        System.out.println("Cores do arcoiris in ordem");

        System.out.println(conj + "\n");

        // Exiba todas as cores uma abaixo da outra

        System.out.println("Uma cor embaixo da outra \n");

        Iterator<String> iterate = conj.iterator();

        while(iterate.hasNext()) {
            System.out.println(iterate.next());
        }
        System.out.println("\n");

        // A quantidade de cores que o arco-íris tem

        System.out.println("Tamanho do Set \n");
        System.out.println(conj.size() + "\n");

        // Exiba as cores na ordem inversa que foi informada

        System.out.println("Ordem reversa \n");

        LinkedList<String> reverseList = new LinkedList<>(conj);

        Iterator<String> reverseIterate = reverseList.descendingIterator();

        while(reverseIterate.hasNext()){
            System.out.println(reverseIterate.next());
        }

        System.out.println("\n");

        // Exiba todas as cores que começam com a letra "v"

        System.out.println("Apenas as que começam com a letra 'v' \n");

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

        System.out.println("Remover todas cores que não começam com a letra 'v' \n");

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

        System.out.println("Remover todas cores \n");

        System.out.println(conj.removeAll(newConj));

        System.out.println("\n");

        System.out.println(conj);

        conj.removeAll(conj);

        System.out.println(conj);

        System.out.println("\n");


        // Exercicio LinguagemFavorita

        // Ordenar por ordem de inserção

        System.out.println("<--------------- Exercicio dois LinguagemFavorita -------------> \n");
        System.out.println("Exibir Set inicial \n");

        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1998, "IntelliJ"));
            add(new LinguagemFavorita("Python", 2007, "Pycharm"));
            add(new LinguagemFavorita("Javascript", 2002, "WebStorm"));
            add(new LinguagemFavorita("C++", 1992, "Notepad++"));
        }};

        System.out.println(linguagens + "\n");
        System.out.println("Exibir em ordem de Inserção\n");

        Iterator<LinguagemFavorita> iterator4 = linguagens.iterator();

        while(iterator4.hasNext()){
            System.out.println(iterator4.next());
        }

        System.out.println("\n");

        // Ordenar por nome

        System.out.println("Exibir por ordem natural \n");

        Set<LinguagemFavorita> linguagensNome = new TreeSet<>(linguagens);

        for(LinguagemFavorita ling: linguagensNome) System.out.println(ling.getNome() + " - " + ling.getAnoDeCriacao() + " - " + ling.getIde());

        System.out.println("\n");
        // Ordenar por IDE

        System.out.println("Exibir por IDE \n");

        Set<LinguagemFavorita> linguagensIDE = new TreeSet<>(new ComparetoIDE());
        linguagensIDE.addAll(linguagens);

        System.out.println("Exibindo a Set linguagensIDE \n");
        System.out.println(linguagensIDE + "\n");

        System.out.println("Exibindo ordenado por IDE \n");

        for(LinguagemFavorita ling: linguagensIDE) System.out.println(ling.getNome() + " - " + ling.getAnoDeCriacao() + " - " + ling.getIde());

        System.out.println("\n Exibir por ano de criação e nome \n");

        Set<LinguagemFavorita> linguagensAnoNome = new TreeSet<>(new ComparetoAnoNome());
        linguagensAnoNome.addAll(linguagens);

        System.out.println("Exibindo ordenado por ano/nome \n");
        for(LinguagemFavorita ling: linguagensAnoNome) System.out.println(ling.getNome() + " - " + ling.getAnoDeCriacao() + " - " + ling.getIde());

        System.out.println("\n Exibir por nome ano e IDE \n");

        Set<LinguagemFavorita> linguagensNomeAnoIDE = new TreeSet<>(new ComparetoNomeAnoIDE());
        linguagensNomeAnoIDE.addAll(linguagens);
        System.out.println("Exibindo por nome ano ide \n");
        for(LinguagemFavorita ling: linguagensNomeAnoIDE) System.out.println(ling.getNome() + " - " + ling.getAnoDeCriacao() + " - " + ling.getIde());

    }


}

class ComparetoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int compareIde = o1.getIde().compareTo(o2.getIde());
        return compareIde;
    }
}

class ComparetoAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if(ano != 0) return ano;

        int nome = o1.getNome().compareTo(o2.getNome());
        return nome;

    }
}

class ComparetoNomeAnoIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;

        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if(ano != 0) return ano;

        int ide = o1.getIde().compareTo(o2.getIde());
        return ide;
    }
}