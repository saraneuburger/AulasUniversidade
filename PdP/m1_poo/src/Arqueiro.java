public class Arqueiro extends Personagem {
    private int forca = 10;

    public Arqueiro(String nome, int level) {
        super(nome, 120, level);
    }

        public int getForca() {
            return forca;
        }
        public void setForca(int forca) {
            this.forca = forca;
        }

        public int atacar() {
            System.out.println(getNome() + " atacou com flecha!");
            return forca;
        }
        public int atacar(String arco) {
            System.out.println(getNome() + " atacou usando " + arco + "!");
            return forca * 4;
    }
}