import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunosProgramando = new ArrayList<>();
        alunosProgramando.add(new Aluno(12));
        alunosProgramando.add(new Aluno(2, cpf, "Monica"));

        List<Aluno> alunosPreVestibular = new ArrayList<>();
        alunosPreVestibular.add(new Aluno(1, cpf, "Murilo"));
        alunosPreVestibular.add(new Aluno(2, cpf, "Jessica"));

        Set<Aluno> alunosIFSP = new HashSet<>();
        for(Aluno aluno : alunosProgramando) {
            alunosIFSP.add(aluno);
        }

        for(Aluno aluno : alunosPreVestibular) {
            alunosIFSP.add(aluno);
        }

        for(Aluno aluno : alunosIFSP) {
            System.out.println(aluno.getNome());
        }
    }
}