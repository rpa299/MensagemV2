package pt.ipg.mensagemv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarMensagem(View view){
        Intent intent = new Intent(this, activity_mostra_mensagem.class);

        EditText editTextMensagem = (EditText) findViewById(R.id.editTextMensagem);
        String mensagem = editTextMensagem.getText().toString();
        intent.putExtra(App.MENSAGEM, mensagem);

        startActivity(intent);
    }
}
