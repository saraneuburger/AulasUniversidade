void main() {
    int dano;

    Guerreiro g01 = new Guerreiro("Hercules", 100, 1);
    Mago m01 = new Mago("Harry", 1);
    Arqueiro a01 = new Arqueiro("Robin Wood",  1);

    Personagem[] personagens = new Personagem[3];

    personagens[0] = g01;
    personagens[1] = m01;
    personagens[2] = a01;

    for(int i = 0; i < personagens.length; i ++) {
        System.out.println(personagens[i].getNome());
    } System.out.println("\n");

    dano = g01.atacar("espada");
    m01.receberDano(dano);

}
