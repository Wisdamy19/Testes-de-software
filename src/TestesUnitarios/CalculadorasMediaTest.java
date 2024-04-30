package TestesUnitarios;

import MediaAlunos.Aluno;
import MediaAlunos.CalculadoraMedias;
import org.junit.Test;

import java.util.*;

import static MediaAlunos.CalculadoraMedias.gerarMediaTurma;
import static MediaAlunos.CalculadoraMedias.percentualAcimaMedia;


import static org.junit.Assert.assertEquals;

public class CalculadorasMediaTest {
    @Test
    public void myTest(){
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

        aluno.setMedia(9.0f);
        aluno1.setMedia(6.0f);
        aluno2.setMedia(4.0f);
        aluno3.setMedia(3.0f);
        aluno4.setMedia(5.0f);

        float expectedMedia = 5.4f;
        float test = gerarMediaTurma(list);

        assertEquals(expectedMedia, test, 1);
    }
    @Test
    public void percentualTest(){
        List<Float> list = new ArrayList<>();

        list.add(7.0f);
        list.add(8.0f);
        list.add(5.0f);
        list.add(3.0f);
        list.add(6.0f);

        float mediaTurma = gerarMediaTurma(list);
        float percentualAcimaMedia = percentualAcimaMedia(mediaTurma, list);

        assertEquals(60.0f, percentualAcimaMedia, 0.01);




    }
}
