public class Personagem {
    private String nome;
    private int vida;
    private int level;

    public Personagem(String nome, int vida, int level) {
        this.nome = nome;
        this.vida = vida;
        this.level = level;
    }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getVida() {
            return vida;
        }
        public void setVida(int vida) {
            this.vida = vida;
        }
        public int getLevel() {
            return level;
        }
        public void setLevel(int level) {
            this.level = level;
        }
            public void receberDano(int dano) {
                vida -= dano;
                if (vida <= 0) {
                    System.out.println("Voce morreu.");
                } else {
                    System.out.println("Vida restante: " + vida);
                }
            }
            public boolean estaVivo() {
            return vida > 0;
    }
}
