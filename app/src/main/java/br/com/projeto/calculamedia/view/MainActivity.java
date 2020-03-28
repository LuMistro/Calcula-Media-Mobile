package br.com.projeto.calculamedia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import br.com.projeto.calculamedia.R;
import br.com.projeto.calculamedia.controller.AlunoControl;
import br.com.projeto.calculamedia.model.Aluno;

public class MainActivity extends AppCompatActivity {

    private Aluno aluno;
    private AlunoControl control;

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
        control = new AlunoControl();

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
        if (!ETnomeAluno.getText().toString().equals("")) {
            aluno.setNome(ETnomeAluno.getText().toString());
        } else {
            aluno.setNome("Não Informado");
        }

        if (!ETnota1.getText().toString().equals("") && !ETnota2.getText().toString().equals("")) {
            aluno.setMedia(control.calculaMedia(new Double(ETnota1.getText().toString()), new Double(ETnota2.getText().toString())));
        } else {
            aluno.setMedia(0.0);
        }
    }

    public void mostraNaTela(View view) {
        pegaDadosTela();
        TVnomeAluno.setText(resNome + aluno.getNome());
        TVMedia.setText(resMedia + aluno.getMedia());
        if (control.isAprovado(aluno.getMedia())) {
            TVSituacao.setText(resSituacao + situacaoAprovado);
        } else {
            TVSituacao.setText(resSituacao + situacaoReprovado);
        }
    }

    public void limparDados(View view) {
        ETnomeAluno.setText("");
        ETnota1.setText("");
        ETnota2.setText("");
        TVnomeAluno.setText("");
        TVMedia.setText("");
        TVSituacao.setText("");
    }
}
