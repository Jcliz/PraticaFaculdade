public class Professor {
    private String nome;
    private int crm;
    private long cpf;
    private int idade;
    private String email;

    public Professor (String nome, int crm, long cpf, int idade, String email) {
        this.nome = nome;
        this.crm = crm;
        this.cpf = cpf;
        this.idade = idade;
        this.email = email;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
                "CRM: " + crm + "\n" +
                "CPF: " + cpf + "\n" +
                "Idade: " + idade + "\n" +
                "E-mail para contato: " + email + "\n";
    }
}
