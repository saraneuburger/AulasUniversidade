void main() {
    // Scanner sc = new Scanner();
    Cachorro cao01 = new Cachorro("Jp", 6, "pug"); // add item a classe
    Cachorro cao02 = new Cachorro("filó", 8, "golden");
    Gato gato01 = new Gato("Lua", 5, "laranja");

    Animal[] animais = new Animal[10];

    animais[0] = cao01;
    animais[1] = cao02;
    animais[2] = gato01;

    for(int i = 0; i < 3; i++) {
        System.out.println(animais[i].getNome());
    }

    for(int i = 0; i < 4; i++) {
        System.out.println(cao01.fazerSom());
    }

    }

