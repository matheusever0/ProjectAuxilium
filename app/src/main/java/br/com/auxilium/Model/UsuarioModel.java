package br.com.auxilium.Model;

import java.util.Date;

public class UsuarioModel {

    private Integer codigo;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private String dataNascimento;
    private String sexo;




    public UsuarioModel() {
    }

    public UsuarioModel(Integer codigo, String nome, String login, String senha, String email, String dataNascimento, String sexo) {
        this.codigo = codigo;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;

    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
