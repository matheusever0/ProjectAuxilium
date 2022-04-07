package br.com.auxilium.Model;

public class AulaModel {

    private Integer idaula;
    private String disciplina;
    private String assunto;
    private String descricao;
    private String datasolicitacao;
    private String local;
    private String horario;
    private String datarealizacao;
    private String concluido;

    public AulaModel() {
    }

    public AulaModel(Integer idaula, String disciplina, String assunto, String descricao, String datasolicitacao, String local, String horario, String datarealizacao, String concluido) {
        this.idaula = idaula;
        this.disciplina = disciplina;
        this.assunto = assunto;
        this.descricao = descricao;
        this.datasolicitacao = datasolicitacao;
        this.local = local;
        this.horario = horario;
        this.datarealizacao = datarealizacao;
        this.concluido = concluido;
    }

    public Integer getIdaula() {
        return idaula;
    }

    public void setIdaula(Integer idaula) {
        this.idaula = idaula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDatasolicitacao() {
        return datasolicitacao;
    }

    public void setDatasolicitacao(String datasolicitacao) {
        this.datasolicitacao = datasolicitacao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDatarealizacao() {
        return datarealizacao;
    }

    public void setDatarealizacao(String datarealizacao) {
        this.datarealizacao = datarealizacao;
    }

    public String getConcluido() {
        return concluido;
    }

    public void setConcluido(String concluido) {
        this.concluido = concluido;
    }
}
