package Animais;

public class Cachorro extends  Animal {

    static  int numeroDeCachorros;

    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome,cor,altura,peso,estadoDeEspirito);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros ++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String pegar(){
       return "Bolinha";
   }

    public  String interagir(String acao){
       switch (acao){
           case "carinho" : this.estadoDeEspirito = "Feliz"; break;
           case "vai dormir" : this.estadoDeEspirito = "Bravo"; break;
           case "pisar na patinha" : this.estadoDeEspirito = "Triste"; break;
           default: this.estadoDeEspirito = "Neutro"; break;
       }

      return  this.estadoDeEspirito;
   }



    @Override
    public void soar() {
        System.out.println("AuAu");
    }
}
