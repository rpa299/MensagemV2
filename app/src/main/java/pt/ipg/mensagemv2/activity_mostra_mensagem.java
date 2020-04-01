package pt.ipg.mensagemv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class activity_mostra_mensagem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_mensagem);

        Intent intent = getIntent();
        String mensagem = intent.getStringExtra(App.MENSAGEM);
        TextView textViewMessage = (TextView) findViewById(R.id.textViewMensagem);
        textViewMessage.setText(mensagem);
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
    }
}
