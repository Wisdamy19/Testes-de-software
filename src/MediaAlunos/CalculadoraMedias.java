package MediaAlunos;

import java.util.ArrayList;

import java.util.List;

public class CalculadoraMedias {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<>();

        Aluno aluno = new Aluno("Antônio", 4623, 7.0f);
        Aluno aluno1 = new Aluno("Vitor", 6794, 8.0f);
        Aluno aluno2 = new Aluno("Cesar", 3567, 5.0f);
        Aluno aluno3 = new Aluno("Leonardo", 7157, 3.0f);
        Aluno aluno4 = new Aluno("Luis", 9361, 6.0f);

        list.add(aluno.getMedia());
        list.add(aluno1.getMedia());
        list.add(aluno2.getMedia());
        list.add(aluno3.getMedia());
        list.add(aluno4.getMedia());
        for (Float item : list){
            System.out.println(item);
        }
        float mediaTurma = gerarMediaTurma(list);
        System.out.println("Média da turma: " + mediaTurma);


        float itensAcima = percentualAcimaMedia(mediaTurma, list);

        System.out.printf("Percentual de alunos acima da média: %2.2f%%", itensAcima);

    }
    public static float gerarMediaTurma(List<Float> list){
        float soma = 0;
        for (Float item : list) {
            soma += item;
        }
        return soma / list.size();
    }
    public static float percentualAcimaMedia(float mediaTurma, List<Float> list){
        int totalItens = list.size();
        int itensAcimaMedia = 0;

        for (Float item : list) {
            if (item > mediaTurma) {
                itensAcimaMedia++;
            }
        }

        return ((float) itensAcimaMedia / totalItens) * 100;
    }
}
