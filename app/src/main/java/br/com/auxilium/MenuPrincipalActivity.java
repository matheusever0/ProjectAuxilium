package br.com.auxilium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import br.com.auxilium.Model.UsuarioModel;
import br.com.auxilium.Repository.UsuarioRepository;

public class MenuPrincipalActivity extends AppCompatActivity {

    private ListView lstViewAulas;
    private Button btnSolicitarAula;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_menu_principal);

        this.btnSolicitarAula=(Button) super.findViewById (R.id.btnSolicitarAula);
        this.lstViewAulas = (ListView) super.findViewById (R.id.lstAulas);
        this.btnVoltar = (Button)super.findViewById (R.id.btnVoltar);

        this.criarEventos ();



    }


    protected void carregarListView(){


        UsuarioRepository usuarioRepository = new UsuarioRepository (this);
        List<UsuarioModel> usuarioModels = usuarioRepository.getTodos ();



    }

    protected void criarEventos(){
        btnSolicitarAula.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuPrincipalActivity.this,CadastrarAulaActivity.class));
                finish ();
            }
        });

        btnVoltar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MenuPrincipalActivity.this, MainActivity.class));
            }
        });

    }

}
