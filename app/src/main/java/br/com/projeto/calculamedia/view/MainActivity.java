package br.com.projeto.calculamedia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import br.com.projeto.calculamedia.R;
import br.com.projeto.calculamedia.model.Aluno;

public class MainActivity extends AppCompatActivity {

    private Aluno aluno;

    private EditText ETnomeAluno;
    private EditText ETnota1;
    private EditText ETnota2;

    private TextView TVnomeAluno;
    private TextView TVMedia;
    private TextView TVSituacao;

    private String resNome;
    private String resMedia;
    private String resSituacao;
    private String situacaoAprovado;
    private String situacaoReprovado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void iniciaObjetos() {
        aluno = new Aluno();

        ETnomeAluno = findViewById(R.id.ETnomeAluno);
        ETnota1 = findViewById(R.id.ETnota1);
        ETnota2 = findViewById(R.id.ETnota2);

        TVnomeAluno = findViewById(R.id.tvNomeAluno);
        TVMedia = findViewById(R.id.tvMedia);
        TVSituacao = findViewById(R.id.tvSituacao);

        resNome = getString(R.string.resultato_nome);
        resMedia = getString(R.string.resultado_media);
        resSituacao = getString(R.string.resultado_situacao);
        situacaoAprovado = getString(R.string.rssultado_aprovado);
        situacaoReprovado = getString(R.string.resultado_reprovado);

    }

    public void pegaDadosTela() {
        iniciaObjetos();
        aluno.setNome(ETnomeAluno.getText().toString());
    

    }


    public void mostraNaTela(View view) {
        pegaDadosTela();
        TVnomeAluno.setText(resNome + aluno.getNome());

    }
}
