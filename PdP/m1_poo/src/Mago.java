public class Mago extends Personagem {

    private int forca = 15;

    public Mago(String nome, int level) {
        super(nome, 80, level);
    }

        public int getForca() {
            return forca;
        }
        public void setForca(int forca) {
            this.forca = forca;
        }

        public int atacar() {
            System.out.println(getNome() + " lançou magia!");
            return forca;
        }
        public int atacar(String magia) {
            System.out.println(getNome() + " lançou " + magia + "!");
            return forca * 4;
    }
}