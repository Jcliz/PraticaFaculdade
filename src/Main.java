import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("""
                ------------BEM-VINDO(a)-----------
                Primeiro, vamos realizar o seu cadastro!
                """);

        System.out.println("Digite seu nome: ");
        String nomeCad = leitor.nextLine();

        System.out.println("Digite seu e-mail: ");
        String emailCad = leitor.nextLine();

        System.out.println("Digite seu CPF: ");
        long cpfCad = leitor.nextLong();

        System.out.println("Digite sua idade: ");
        int idadeCad = leitor.nextInt();

        System.out.println("Digite seu curso: ");
        leitor.nextLine();
        String cursoCad = leitor.nextLine();

        Cadastro cad = new Cadastro(nomeCad, emailCad, cpfCad, idadeCad, cursoCad);

        Disciplina bd = new Disciplina ("Banco de Dados", "Sala - 124", "Quarta 19:45 - 23:00", new Professor("Cristina", 416323, 1371923812038L, 45, "profcristina@gmail.com"), null);
        Disciplina filosofia = new Disciplina ("Filosofia", "Sala - 124", "Quarta 18:15 - 19:45", new Professor("Wilton", 512723, 497492432238L, 47, "profwilton@gmail.com"), null);
        Disciplina mat = new Disciplina ("Matemática Discreta", "Sala - 124", "Quarta 21:30 - 23:00", new Professor("Guilherme", 617351, 6391906612038L, 36, "profguilherme@gmail.com"), null);
        Disciplina poo = new Disciplina ("Programação Orientada a Objetos", "Sala - 124", "Quinta 19:45 - 23:00", new Professor("Marina", 916451, 223551231157L, 27, "profmarina@gmail.com"), null);
        Disciplina web = new Disciplina ("Web-development: Front-end", "Sala - 124", "Segunda 18:15 - 21:30", new Professor("Cleverson", 455271, 451253931157L, 34, "profcleverson@gmail.com"), null);

        Disciplina disciplina = new Disciplina();
        disciplina.criarDisciplinas(bd, filosofia, mat, poo, web);

        while (true) {
            System.out.println("Você é um aluno? (s/n):");
            String opcaoAluno = leitor.nextLine();

            if (opcaoAluno.equals("s")) {
                new Aluno(nomeCad, emailCad, cpfCad, idadeCad, cursoCad);
                System.out.println("\n" + "Aluno cadastrado com sucesso!");
                System.out.println();
                break;

            } else if (opcaoAluno.equals("n")) {
                System.out.println("""
                
                Conta de resposável cadastrada com sucesso!
                """);
                break;
            } else {
                System.out.println("""
                        
                        Opção inválida, tente novamente!
                        
                        """);
            }
        }

        Aluno novoAluno = null;

        while (true){
            System.out.println("""
                                Escolha uma opção:
                                
                                [1] - Matricular aluno
                                [2] - Trancar disciplina
                                [3] - Listar aluno
                                [4] - Pesquisar disciplina
                                [5] - Pesquisar aluno
                                [6] - Alterar dados cadastrais
                                
                                [0] - Sair
                                """);

            int opcao = leitor.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("Indique o nome do aluno: ");
                    leitor.nextLine();
                    String nomeMat = leitor.nextLine();

                    System.out.println("Indique o email do aluno: ");
                    String emailMat = leitor.nextLine();

                    System.out.println("Indique o CPF do aluno: ");
                    long cpfMat = leitor.nextLong();

                    System.out.println("Indique a idade do aluno: ");
                    int idadeMat = leitor.nextInt();

                    System.out.println("Indique o curso do aluno: ");
                    leitor.nextLine();
                    String cursoMat = leitor.nextLine();
                    System.out.println();

                    novoAluno = new Aluno(nomeMat, emailMat, cpfMat, idadeMat, cursoMat);

                    System.out.println("""
                            Escolha uma disciplina:
                            
                            [0] - Banco de Dados
                            [1] - Filosofia
                            [2] - Matemática Discreta
                            [3] - Programação Orientada a Objetos
                            [4] - Web Development: Front-end
                            
                            [5] - Voltar
                            """);

                    int matriculaMat = leitor.nextInt();

                    switch (matriculaMat) {
                        case 0:
                            bd.criarDisciplinas(bd, filosofia, mat, poo, web);
                            bd.matricularAlunos(novoAluno, matriculaMat);
                            break;

                        case 1:
                            filosofia.criarDisciplinas(bd, filosofia, mat, poo, web);
                            filosofia.matricularAlunos(novoAluno, matriculaMat);
                            break;

                        case 2:
                            mat.criarDisciplinas(bd, filosofia, mat, poo, web);
                            mat.matricularAlunos(novoAluno, matriculaMat);
                            break;

                        case 3:
                            poo.criarDisciplinas(bd, filosofia, mat, poo, web);
                            poo.matricularAlunos(novoAluno, matriculaMat);
                            break;

                        case 4:
                            web.criarDisciplinas(bd, filosofia, mat, poo, web);
                            web.matricularAlunos(novoAluno, matriculaMat);
                            break;

                        case 5:
                            break;

                        default:
                            System.out.println("Opção inválida." + "\n");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Primeiro indique o aluno que você deseja trancar a matrícula (nome): ");
                    leitor.nextLine();
                    String nomeBusca = leitor.nextLine();
                    System.out.println();



                    System.out.println("Aluno inexistente." + "\n");
                    System.out.println("""
                                Agora, escolha uma disciplina para trancar:
                                
                                [0] - Banco de Dados
                                [1] - Filosofia
                                [2] - Matemática Discreta
                                [3] - Programação Orientada a Objetos
                                [4] - Web Development: Front-end

                                [5] - Voltar
                                """);

                    int trancarMat = leitor.nextInt();

                    switch (trancarMat) {
                            case 0:
                                Aluno resultBuscaBD = bd.buscarAluno(nomeBusca);
                                if (resultBuscaBD == null) {
                                    System.out.println("Aluno inexistente." + "\n");
                                } else {
                                    bd.criarDisciplinas(bd, filosofia, mat, poo, web);
                                    bd.removerAlunos(novoAluno, trancarMat);
                                }
                                break;

                            case 1:
                                Aluno resultBuscaFil = filosofia.buscarAluno(nomeBusca);
                                if (resultBuscaFil == null) {
                                    System.out.println("Aluno inexistente." + "\n");
                                } else {
                                    filosofia.criarDisciplinas(bd, filosofia, mat, poo, web);
                                    filosofia.removerAlunos(novoAluno, trancarMat);
                                }
                                break;

                            case 2:
                                Aluno resultBuscaMat = mat.buscarAluno(nomeBusca);
                                if (resultBuscaMat == null) {
                                    System.out.println("Aluno inexistente." + "\n");
                                } else {
                                    mat.criarDisciplinas(bd, filosofia, mat, poo, web);
                                    mat.removerAlunos(novoAluno, trancarMat);
                                }
                                break;

                            case 3:
                                Aluno resultBuscaPOO = poo.buscarAluno(nomeBusca);
                                if (resultBuscaPOO == null) {
                                    System.out.println("Aluno inexistente." + "\n");
                                } else {
                                    poo.criarDisciplinas(bd, filosofia, mat, poo, web);
                                    poo.removerAlunos(novoAluno, trancarMat);
                                }
                                break;

                            case 4:
                                Aluno resultBuscaWEB = web.buscarAluno(nomeBusca);
                                if (resultBuscaWEB == null) {
                                    System.out.println("Aluno inexistente." + "\n");
                                } else {
                                    web.criarDisciplinas(bd, filosofia, mat, poo, web);
                                    web.removerAlunos(novoAluno, trancarMat);
                                }
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Opção inválida." + "\n");
                                break;
                    }
                    break;

                case 3:
                    System.out.println("Qual é o aluno que você deseja listar? (nome): ");
                    leitor.nextLine();
                    String aluno = leitor.nextLine();
                    Aluno printAluno = filosofia.buscarAluno(aluno);

                    if (printAluno == null) {
                        System.out.println("Aluno inexistente.");
                    } else {
                        System.out.println(printAluno);
                    }
                    break;

                case 4:
                    System.out.println("Qual é a disciplina que você deseja buscar?: ");
                    leitor.nextLine();
                    String disci = leitor.nextLine();
                    System.out.println();

                    Disciplina resultadoBusca = disciplina.buscarDisciplina(disci);

                    if (resultadoBusca == null) {
                        System.out.println("Disciplina inexistente." + "\n");
                    } else {
                        System.out.println(resultadoBusca);
                    }
                    break;

                case 5:
                    System.out.println("Identifique o aluno que você deseja encontrar (relacionado à uma matéria): ");
                    leitor.nextLine();
                    String alunoBusca = leitor.nextLine();

                    Disciplina busca = disciplina.buscarDisciplina(alunoBusca);

                    if (busca == null) {
                        System.out.println("""
                                
                                Aluno inexistente.
                                
                                """);
                    } else {
                        System.out.println(busca);
                    }
                    break;

                case 6:
                    System.out.println("""
                            
                            -----------NOVO CADASTRO-----------
                            """);
                    System.out.println("Digite o seu nome: ");
                    leitor.nextLine();
                    String novoNomeCad = leitor.nextLine();

                    System.out.println("Digite seu e-mail: ");
                    String novoEmailCad = leitor.nextLine();

                    System.out.println("Digite seu CPF: ");
                    long novoCpfCad = leitor.nextLong();

                    System.out.println("Digite sua idade: ");
                    int novaIdadeCad = leitor.nextInt();

                    System.out.println("Por fim, qual é o seu curso?: ");
                    leitor.nextLine();
                    String novoCursoCad = leitor.nextLine();

                    System.out.println("""
                            
                            Cadastrando...
                            """);
                    leitor.nextLine();

                    cad.setNovoCadastro(novoNomeCad, novoEmailCad, novoCpfCad, novaIdadeCad, novoCursoCad);
                    System.out.println(cad);
                    System.out.println("""
                            Aluno cadastrado!
                            
                            """);
                    break;

                case 0:
                    System.out.println("Agradeçemos o seu acesso! :D");
                    break;

                default:
                    System.out.println("Opção inválida tente, novamente.");
                    break;
            }
        }
    }
}
