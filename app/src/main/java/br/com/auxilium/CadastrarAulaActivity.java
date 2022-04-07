package br.com.auxilium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.auxilium.Model.AulaModel;
import br.com.auxilium.Util.Utilidades;

public class CadastrarAulaActivity extends AppCompatActivity {


    private EditText edtDisciplina;
    private EditText edtAssunto;
    private EditText edtDescricao;
    private EditText edtLocal;
    private Button btnCadastrarAula;
    private Button btnCancelarAula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_cadastrar_aula);


        this.CriarComponentes ();
        this.Eventos ();

    }


    public void CriarComponentes(){

        this.edtAssunto = (EditText)super.findViewById (R.id.edtAssunto);
        this.edtDescricao = (EditText)super.findViewById (R.id.edtDescricao);
        this.edtDisciplina = (EditText)super.findViewById (R.id.edtDisciplina);
        this.edtLocal = (EditText)super.findViewById (R.id.edtLocal);
        this.btnCadastrarAula = (Button)super.findViewById (R.id.btnCadastrarAula);
        this.btnCancelarAula = (Button)super.findViewById (R.id.btnCancelarAula);
    }

    public void LimparCampos(){

        this.edtAssunto.setText (null);
        this.edtDescricao.setText (null);
        this.edtDisciplina.setText (null);
        this.edtLocal.setText (null);
    }

    public void SalvarAula(){

        if(this.edtLocal.getText ().toString ().trim ().isEmpty () || this.edtLocal.getText ().toString ().trim ().equals (null)){
            Utilidades.Alert (this, "O Local deve ser informado");
            edtLocal.requestFocus ();
        }else if(this.edtDisciplina.getText ().toString ().trim ().isEmpty () || this.edtDisciplina.getText ().toString ().trim ().equals (null)){
            Utilidades.Alert (this,"A Disciplina deve ser informada");
            edtDisciplina.requestFocus ();
        }else if(this.edtDescricao.getText ().toString ().trim ().isEmpty () || this.edtDescricao.getText ().toString ().trim ().equals (null)){
            Utilidades.Alert (this,"A Descrição deve ser informada");
            edtDescricao.requestFocus ();
        }else if(this.edtAssunto.getText ().toString ().trim ().isEmpty () || this.edtAssunto.getText ().toString ().trim ().equals (null)){
            Utilidades.Alert (this, "O Assunto deve ser informado");
            edtAssunto.requestFocus ();
        }else{

            AulaModel aula = new AulaModel ();
            aula.setDisciplina (edtDisciplina.getText ().toString ().trim ());
            aula.setAssunto (edtAssunto.getText ().toString ().trim ());
            aula.setDescricao (edtDescricao.getText ().toString ().trim ());
            aula.setLocal (edtLocal.getText ().toString ().trim ());

            /// FORMATANDO A DATA COM A DATA ATUAL
            SimpleDateFormat data = new SimpleDateFormat ("dd-MM-yyyy");
            Date date = new Date ();
            String dataformada = data.format (date);

            aula.setDatasolicitacao (dataformada);

            aula.setConcluido ("0");
            aula.setHorario (" - ");
            aula.setDatarealizacao (" - ");

            //Adiciona no web service

            Utilidades.Alert (this, "Aula Solicitada com sucesso");
            LimparCampos ();
            startActivity (new Intent (this, MenuPrincipalActivity.class));
        }
    }


    public void Eventos(){

        btnCancelarAula.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                LimparCampos ();
                startActivity (new Intent (CadastrarAulaActivity.this,MenuPrincipalActivity.class));
                finish ();
            }
        });

        btnCadastrarAula.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                SalvarAula ();
                startActivity (new Intent (CadastrarAulaActivity.this, MenuPrincipalActivity.class));
                finish ();
            }
        });

    }



}
