import Excecoes.SenhaInvalida;
import RedesSociais.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //criando o vetor
        Map<String, RedeSocial> hashmap = new HashMap<>();

        //criando o usuario
        Usuario u1 = new Usuario("Lucas", "lucas@gmail.com", hashmap);

        //boas vindas
        System.out.println("Bem vindo usuario " + u1.getNome() + " do email " + u1.getEmail());

        //redes sociais
        Facebook f = null;
        Instagram i = null;

        //inseriando sa informacoes das redes sociais
        try {
            f = new Facebook("Facebook10", 50);
        } catch (SenhaInvalida e) {
            System.out.println(e.getMessage());
        }

        try{
            i = new Instagram("Instragram10", 150);
        } catch(SenhaInvalida e){
            System.out.println(e.getMessage());
        }

        //linkando as redes sociais ao usuario
        try {
            u1.getHashMap().put("Facebook", f);
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        try{
            u1.getHashMap().put("Instagram", i);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        //executando as acoes das redes sociais
        try {
            u1.getHashMap().get("Instagram").executar();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        try {
            u1.getHashMap().get("Facebook").executar();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}