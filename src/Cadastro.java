public class Cadastro {
    private String nomeCad;
    private String emailCad;
    private long cpfCad;
    private int idadeCad;
    private String cursoCad;

    public Cadastro (String nome, String email, long cpf, int idade, String curso) {
        this.nomeCad = nome;
        this.emailCad = email;
        this.cpfCad = cpf;
        this.idadeCad = idade;
        this.cursoCad = curso;
    }

    public void setNovoCadastro (String nome, String email, long cpf, int idade, String curso) {
        this.nomeCad = nome;
        this.emailCad = email;
        this.cpfCad = cpf;
        this.idadeCad = idade;
        this.cursoCad = curso;
    }

    public String toString() {
        return "Nome: " + nomeCad + "\n" +
                "E-mail: " + emailCad + "\n" +
                "CPF: " + cpfCad + "\n" +
                "Idade: " + idadeCad + "\n" +
                "Curso: " + cursoCad + "\n";
    }
}
