import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String email;
    private long cpf;
    private int idade;
    private String curso;

    public Aluno(String nome, String email, long cpf, int idade, String curso) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
        this.curso = curso;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
                "E-mail: " + email + "\n" +
                "CPF: " + cpf + "\n" +
                "Idade: " + idade + "\n" +
                "Curso: " + curso;
    }

    public String getNome()  {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Long getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }
}
