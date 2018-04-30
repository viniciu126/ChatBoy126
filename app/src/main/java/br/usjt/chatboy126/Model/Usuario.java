package br.usjt.chatboy126.Model;

/**
 * Created by vinic on 22/04/2018.
 */

public class Usuario {

    private String nome;
    private  String email;
    private int id;

    public Usuario() {
    }

    public Usuario(String nome, String email, int id) {
        this.nome = nome;
        this.email = email;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
