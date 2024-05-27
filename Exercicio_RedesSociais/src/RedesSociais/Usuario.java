package RedesSociais;

import java.util.Map;

public class Usuario {

    private String nome;
    private String email;
    private Map<String,RedeSocial> HashMap;

    //construtor para inserir o nome, email e linkar as redes sociais ao usuario
    public Usuario(String nome, String email, Map<String, RedeSocial> hashMap) {
        this.nome = nome;
        this.email = email;
        this.HashMap = hashMap;
    }

    //para mostrar o nome do usuario
    public String getNome() {
        return nome;
    }

    //para mostrar o email do usuario
    public String getEmail() {
        return email;
    }

    //para acessar o HashMap
    public Map<String, RedeSocial> getHashMap() {
        return HashMap;
    }
}
