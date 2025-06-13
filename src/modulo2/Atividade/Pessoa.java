package modulo2.Atividade;
public class Pessoa {
    private String nome;
    private int idade;
    private String nacionalidade;

    // CONTRUTOR DE USUARIO
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // CONTRUTOR DE AUTOR
    public Pessoa(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNacionalidade() {
    return nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void apresentar() {
        System.out.println("nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}  