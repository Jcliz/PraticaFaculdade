import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String sala;
    private String horario;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Disciplina> discis = new ArrayList<>();

    public Disciplina (String nome, String sala, String horario, Professor professor, Aluno alunos){
        this.nome = nome;
        this.sala = sala;
        this.horario = horario;
        this.professor = professor;
        this.alunos.add(alunos);
    }

    public Disciplina (){

    }

    public String toString() {
        return "Nome da matéria: " + nome + "\n" +
                "Sala de aula: " + sala + "\n" +
                "Horário de aula: " + horario + "\n" +
                "Professor: " + professor + "\n" +
                "Alunos matriculados: " + alunos + "\n";
    }

    public void matricularAlunos(Aluno aluno, int opcao) {
        if (opcao <= 0 || opcao > 5) {
            System.out.println("Opção inválida!" + "\n");
            return;
        }

        if (alunos.getFirst() == null) {
            Disciplina disciplinaSelecionada = discis.get(opcao);
            disciplinaSelecionada.alunos.set(0, aluno);
            System.out.println("\n" + "Aluno matriculado com sucesso na disciplina: " + disciplinaSelecionada.nome + "\n");
        } else {
            Disciplina disciplinaSelecionada = discis.get(opcao);
            disciplinaSelecionada.alunos.add(aluno);
            System.out.println("Aluno matriculado com sucesso na disciplina: " + disciplinaSelecionada.nome + "\n");
        }
    }


    public void removerAlunos (Aluno aluno, int opcao) {
        if (opcao <= 0 || opcao > 5) {
            System.out.println("Opção inválida!" + "\n");
            return;
        }

        Disciplina disciplinaSelecionada = discis.get(opcao);
        disciplinaSelecionada.alunos.remove(aluno);
        System.out.println("Aluno desmatriculado com sucesso na disciplina: " + disciplinaSelecionada.nome + "\n");
    }

    public void criarDisciplinas(Disciplina bd, Disciplina filosofia, Disciplina mat, Disciplina poo, Disciplina web) {
        discis.add(bd);
        discis.add(filosofia);
        discis.add(mat);
        discis.add(poo);
        discis.add(web);
    }

    public Aluno buscarAluno(String nomeBusca) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nomeBusca)) {
                return aluno;
            }
        }
        return null;
    }

    public Disciplina buscarDisciplina (String nomeBusca) {
        for (Disciplina disc : discis) {
            if (disc.nome.equals(nomeBusca)) {
                return disc;
            }
        }
        return null;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Disciplina> getDiscis() {
        return discis;
    }
}