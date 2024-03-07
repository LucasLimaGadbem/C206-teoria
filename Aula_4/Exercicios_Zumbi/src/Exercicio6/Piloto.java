package Exercicio6;

public class Piloto {

    String nome;
    boolean vilao;

    void soltaSuperPoder(){
        if(vilao) {
            System.out.println("A Vilã "+nome +" esta soltando o super poder");
        }
        else{
            System.out.println("O "+nome+" esta soltando o super poder");
        }
    }
}
