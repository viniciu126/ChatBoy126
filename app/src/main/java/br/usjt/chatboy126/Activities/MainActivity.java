package br.usjt.chatboy126.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

import br.usjt.chatboy126.DAO.UsuarioDAO;
import br.usjt.chatboy126.Model.Usuario;
import br.usjt.chatboy126.R;
import br.usjt.chatboy126.config.ConfiguracaoFirebase;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private  EditText nome;
    private Button btn_entrar;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        email = (EditText) findViewById(R.id.idEmail);
        nome = (EditText) findViewById(R.id.idNome);
        btn_entrar = (Button) findViewById(R.id.btnEntrarId);

        //databaseReference = ConfiguracaoFirebase.getFirebase();

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario usuario = new Usuario();
                usuario.setNome(nome.getText().toString());
                usuario.setEmail(email.getText().toString());
                UsuarioDAO dao = new UsuarioDAO();
                dao.cadastrar(usuario);

                Intent intent = new Intent(MainActivity.this, ConversaActivity.class);
                startActivity(intent);

            }
        });*/
    }

    public void entrar(View view){
        //Linkando dados da activity com o XML
        email = (EditText) findViewById(R.id.idEmail);
        nome = (EditText) findViewById(R.id.idNome);
        btn_entrar = (Button) findViewById(R.id.btnEntrarId);

        //Pegando dados do Edit_Text
        Usuario usuario = new Usuario();
        usuario.setNome(nome.getText().toString());
        usuario.setEmail(email.getText().toString());

        //Criando usuário
        UsuarioDAO dao = new UsuarioDAO();
        dao.cadastrar(usuario);

        //Abrindo nova activity
        Intent intent = new Intent(MainActivity.this, ConversaActivity.class);
        startActivity(intent);
    }




}
