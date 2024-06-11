package Lojas;

import Animais.Animal;
import Animais.Cachorro;

public class Petshop {

    public void banho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public void deixaNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Saudade");
    }
}
