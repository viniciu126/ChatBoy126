package br.usjt.chatboy126.config;

/**
 * Created by vinic on 22/04/2018.
 */
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public final class ConfiguracaoFirebase {

    private static DatabaseReference referenciaFirebase;

    public static DatabaseReference getFirebase(){
        if(referenciaFirebase == null) {
            referenciaFirebase = FirebaseDatabase.getInstance().getReference();
        }

        return referenciaFirebase;
    }
}
