import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("PiuPiu", "Marron", 25, 5.5, "nada");
        Gato gato2 = new Gato("PiuPiu", "Marron", 25, 5.5, "nada");
        Passaro passaro1 = new Passaro("PiuPiu", "Marron", 25, 5.5, "nada");
        gato1.soar();
        gato2.soar();
        passaro1.soar();
    }


}
