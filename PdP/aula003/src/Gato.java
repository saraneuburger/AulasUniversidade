public class Gato extends Animal {

    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }
    void miar() {
        System.out.println(this.getNome() + " disse Miau");
    }

}
