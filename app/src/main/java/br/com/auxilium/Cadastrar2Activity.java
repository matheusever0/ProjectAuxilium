package br.com.auxilium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.auxilium.Model.EstadoModel;
import br.com.auxilium.Model.InstituicaoEnsinoModel;
import br.com.auxilium.Util.Utilidades;

public class Cadastrar2Activity extends AppCompatActivity {

    private EditText edtInstituicaoEnsino;
    private EditText edtEndereco;
    private EditText edtNumero;
    private EditText edtBairro;
    private EditText edtCidade;
    private EditText edtCep;
    private EditText edtEstado;
    private EditText edtSiglaEstado;
    private Button btnConcluir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_cadastrar2);

        this.criarComponentes ();

    }

    protected void criarComponentes(){
        edtInstituicaoEnsino = (EditText)super.findViewById (R.id.edtInstituicaoEnsino);
        edtEndereco = (EditText)super.findViewById (R.id.edtEndereco);
        edtNumero = (EditText)super.findViewById (R.id.edtNumero);
        edtBairro = (EditText)super.findViewById (R.id.edtBairro);
        edtCidade = (EditText)super.findViewById (R.id.edtCidade);
        edtCep = (EditText)super.findViewById (R.id.edtCep);
        edtEstado = (EditText)super.findViewById (R.id.edtEstado);
        btnConcluir = (Button)super.findViewById (R.id.btnConcluir);
        edtSiglaEstado = (EditText)super.findViewById (R.id.edtSiglaEstado);
    }

    private boolean isCampoVazio(String valor) {
        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
        return resultado;
    }


    /* if(this.edtNome.getText ().toString ().trim ().isEmpty () || this.edtNome.getText ().toString ().equals (null)){
            Utilidades.Alert (this, String.valueOf ("O Nome deve ser informado"));
            this.edtNome.requestFocus ();
        }

        */

    protected void finalizarSalvar(){

        boolean res = false;

        if(this.edtInstituicaoEnsino.getText ().toString ().trim ().isEmpty () || this.edtInstituicaoEnsino.getText ().toString ().equals (null)){
            Utilidades.Alert (this,String.valueOf ("A Instituicção de Ensino deve ser informada"));
            this.edtInstituicaoEnsino.requestFocus ();
        }else if(this.edtCep.getText ().toString ().trim ().isEmpty () || this.edtCep.getText ().toString ().equals (null)){
            Utilidades.Alert (this, String.valueOf ("O CEP deve ser informado"));
            this.edtCep.requestFocus ();
        }else if(this.edtCidade.getText ().toString ().trim ().isEmpty () || this.edtCidade.getText ().toString ().equals (null)){
            Utilidades.Alert (this, String.valueOf ("A Cidade deve ser informada"));
            edtCidade.requestFocus ();
        }else if(this.edtBairro.getText ().toString ().trim ().isEmpty () || this.edtBairro.getText ().toString ().trim ().equals (null)){
            Utilidades.Alert (this, String.valueOf ("O Bairro deve ser informado"));
            edtBairro.requestFocus ();
        }else if(this.edtNumero.getText ().toString ().trim ().isEmpty () || this.edtNumero.getText ().toString ().equals (null)){
            Utilidades.Alert (this, String.valueOf ("O Numero de ser informado"));
            edtNumero.requestFocus ();
        }else if(this.edtEstado.getText ().toString ().trim ().isEmpty () || this.edtEstado.getText ().toString ().equals (null)){
            Utilidades.Alert (this, "O Estado deve ser informado");
            edtEstado.requestFocus ();
        } else if(this.edtSiglaEstado.getText ().toString ().trim ().isEmpty () || this.edtSiglaEstado.getText ().toString ().equals (null)){
            Utilidades.Alert (this,"A Sigla do Estado deve sem informado");
            edtSiglaEstado.requestFocus ();
        } else if ((this.edtEndereco.getText ().toString ().trim ().isEmpty () || this.edtEndereco.getText ().toString ().equals (null))){
            Utilidades.Alert (this, String.valueOf ("O Endereço deve ser informado"));
            edtEndereco.requestFocus ();
        }else{

            ///CRIAR NOVO OBJETO




        }

    }


    protected void criarEventos(){

        btnConcluir.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finalizarSalvar ();
                startActivity (new Intent (getApplicationContext (),MainActivity.class));
                finish ();
            }
        });



    }

}
