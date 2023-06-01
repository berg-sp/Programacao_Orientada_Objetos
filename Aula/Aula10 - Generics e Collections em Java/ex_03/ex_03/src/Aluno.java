public class Aluno {
    private int cpf;
    private String nome;

    publi Aluno(int id, String nome) {
        this.cpf = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object objeto) {
        if(super.equals(objeto)) {
            return true;
        }
        Aluno aluno = (Aluno) objeto;

        if(this.cpf == aluno.getCpf()){
            return true;
        }

    }

    public int getCpf() {
        return cpf;
    }
}
