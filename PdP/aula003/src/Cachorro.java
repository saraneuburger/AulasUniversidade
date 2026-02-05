public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, String raca) { //construtor
        super(nome, idade, raca);
    }

    @Override
    public void fazerSom() {
        latir();
    }
    void latir() {
        System.out.println(this.getNome() + " disse AuAu");
    }
}
