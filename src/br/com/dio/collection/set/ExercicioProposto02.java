package br.com.dio.collection.set;

import java.util.*;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        System.out.println("----------\tOrdem Aleatória\t-----------");
        Set<LinguagemFavorita> linguagem = new HashSet<>(){{
            add(new LinguagemFavorita("Java"  , 1980 , "Visual Studio Code"));
            add(new LinguagemFavorita("Python", 2000 , "IntelliJ"));
            add(new LinguagemFavorita("Php"   , 1991 , "Eclipse"));
        }};
        for (LinguagemFavorita linguagens: linguagem) {
            System.out.println(linguagens.getNome() + "--" + linguagens.getAnoDeCriacao() + "--" + linguagens.getIde());
        }
        System.out.println("");

        System.out.println("----------\tOrdem Inserção\t-----------");
        Set<LinguagemFavorita> linguagem2 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java"  , 1980 , "Visual Studio Code"));
            add(new LinguagemFavorita("Python", 2000 , "IntelliJ"));
            add(new LinguagemFavorita("Php"   , 1991 , "Eclipse"));
        }};
        for (LinguagemFavorita linguagens: linguagem2) {
            System.out.println(linguagens.getNome() + "--" + linguagens.getAnoDeCriacao() + "--" + linguagens.getIde());
        }
        System.out.println("");

        System.out.println("----------\tOrdem Natural por nome\t-----------");
        Set<LinguagemFavorita> linguagem3 = new TreeSet<>(linguagem2);
        for (LinguagemFavorita linguagens: linguagem2) {
            System.out.println(linguagens.getNome() + "--" + linguagens.getAnoDeCriacao() + "--" + linguagens.getIde());
        }


    }
}
    class LinguagemFavorita implements Comparable<LinguagemFavorita>{
        private String nome;
        private Integer anoDeCriacao;
        private String ide;

        public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
            this.nome = nome;
            this.anoDeCriacao = anoDeCriacao;
            this.ide = ide;
        }

        public String getNome() {
            return nome;
        }

        public Integer getAnoDeCriacao() {
            return anoDeCriacao;
        }

        public String getIde() {
            return ide;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", anoDeCriacao=" + anoDeCriacao +
                    ", ide='" + ide + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LinguagemFavorita that = (LinguagemFavorita) o;
            return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && ide.equals(that.ide);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, anoDeCriacao, ide);
        }

        @Override
         public int compareTo(LinguagemFavorita linguagemFavorita) {
                return this.nome.compareTo(linguagemFavorita.nome);
            }

    }
