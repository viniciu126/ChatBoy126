package br.usjt.chatboy126.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

import br.usjt.chatboy126.Model.Mensagem;
import br.usjt.chatboy126.R;

public class ConversaActivity extends AppCompatActivity {

    //Dados da mensagem
    private EditText editMensagem;
    private Button  btnEnviar;
    //private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

    //Dados do remetente (usuário)
    private String idUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editMensagem = findViewById(R.id.edit_mensagem);
        btnEnviar = findViewById(R.id.btn_enviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoMensagem = editMensagem.getText().toString();
                if(textoMensagem.isEmpty()){
                    //Toast.makeText(ConversaActivity.this, "Digite uma mensagem", Toast.LENGTH_LONG.).show();
                }else{
                    Mensagem mensagem = new Mensagem();
                    //mensagem.setMensagem();
                }
            }
        });
    }
}
