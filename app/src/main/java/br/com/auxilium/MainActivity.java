package br.com.auxilium;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.auxilium.Util.DAOUtil;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase conexao;
    private DAOUtil usuarioRepository;
    private EditText edtLogin;
    private EditText edtSenha;
    private Button btnCadastrar;
    private Button btnLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        this.criarConexao ();
        this.criarComponentes ();
        this.eventos ();


    }

    protected void criarComponentes(){
        edtLogin = (EditText)super.findViewById (R.id.edtLogin);
        edtSenha = (EditText)super.findViewById (R.id.edtSenha);
        btnCadastrar = (Button) super.findViewById (R.id.btnCadastrar);
        btnLogin = (Button)super.findViewById (R.id.btnLogin);


    }

    protected void eventos(){
        btnCadastrar.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (getApplicationContext (),CadastrarActivity.class));
                finish ();
            }
        });

        btnLogin.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                startActivity (new Intent (getApplicationContext (),MenuPrincipalActivity.class));
                finish ();

            }
        });

    }


    private void criarConexao() {
        try {

            usuarioRepository = new DAOUtil (this);

            conexao = usuarioRepository.getWritableDatabase ();

            // Snackbar.make (layout,"Conexão bem sucedida!",Snackbar.LENGTH_LONG).setAction ("OK",null).show ();

            AlertDialog.Builder dlg2 = new AlertDialog.Builder (this);
            dlg2.setTitle ("Conexão bem sucedida");
            dlg2.setMessage ("Ok");
            dlg2.show ();

        } catch (SQLException ex) {

            AlertDialog.Builder dlg = new AlertDialog.Builder (this);
            dlg.setTitle (getString(R.string.action_erro_banco));
            dlg.setMessage (ex.getMessage ());
            dlg.setNeutralButton ("OK", null);
            dlg.show ();

        }
    }

    protected void Cadastrar(){
        startActivity(new Intent (MainActivity.this, CadastrarActivity.class));
        finish();
    }

}
