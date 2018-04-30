package br.usjt.chatboy126.Model;

/**
 * Created by vinic on 22/04/2018.
 */

public class Mensagem {
    private String mensagem;
    private String idUsuario;

    public Mensagem(String mensagem, String idUsuario) {
        this.mensagem = mensagem;
        this.idUsuario = idUsuario;
    }

    public Mensagem(){

    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
