package br.usjt.chatboy126.DAO;

import android.view.View;

import com.google.firebase.database.DatabaseReference;

import br.usjt.chatboy126.Model.Usuario;
import br.usjt.chatboy126.config.ConfiguracaoFirebase;

public class UsuarioDAO {

    DatabaseReference databaseReference;


    public Usuario cadastrar(Usuario usuario){
        databaseReference = ConfiguracaoFirebase.getFirebase();
        databaseReference.child("usuario").push().setValue(usuario);
        return usuario;
    }
}
