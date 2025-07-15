package MiddleLevel.SobreEscrita;
    public abstract class Investigadores implements Estrategia {
        protected String nome;
        protected int idade;
        protected String especialidade;
        protected int numeroDeMissoes;
        protected RankCCG Rank;

        public Investigadores(String nome, int idade, String especialidade) {
            this.nome = nome;
            this.idade = idade;
            this.especialidade = especialidade;
        }
        public Investigadores (String nome, int idade, String especialidade, int numeroDeMissoes, RankCCG Rank) {
            this(nome, idade, especialidade);
            this.numeroDeMissoes = numeroDeMissoes;
            this.Rank = Rank;
        }



        public void arma() {
            System.out.println("Eu sou " + nome + " e minha arma é " + especialidade);
        }
    }
