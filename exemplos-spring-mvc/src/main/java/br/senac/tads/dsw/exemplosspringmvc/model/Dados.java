package br.senac.tads.dsw.exemplosspringmvc.model;

public class Dados {
  private String nome;
  private String email;
  private String telefone;
  private String nascimento;
  private String cargo;
  private String linkedin;
  private String github;
  private String linguagens;

  public Dados(String nome, String email, String telefone, String nascimento, String cargo, String linkedin, String github, String linguagens) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.nascimento = nascimento;
    this.cargo = cargo;
    this.linkedin = linkedin;
    this.github = github;
    this.linguagens = linguagens;
  }

  public Dados() {

  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getNascimento() {
    return nascimento;
  }

  public void setNascimento(String nascimento) {
    this.nascimento = nascimento;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getLinkedin() {
    return linkedin;
  }

  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }

  public String getGithub() {
    return github;
  }

  public void setGithub(String github) {
    this.github = github;
  }

  public String getLinguagens() {
    return linguagens;
  }

  public void setLinguagens(String linguagens) {
    this.linguagens = linguagens;
  }
}
