public class Guerreiro extends Personagem {
    private int forca = 20;

    public Guerreiro(String nome, int vida, int level) {
        super(nome, 100, level);
    }

    public int getForca() {
        return forca;
    }
    public void setForca() {
        this.forca = forca;
    }

    public int atacar() {
        System.out.println(getNome() + " atacou com força física!");
        return forca;
    }
    public int atacar(String arma) {
        System.out.println(getNome() + " atacou usando " + arma + "!");
        return forca * 2;
    }
}
