import java.util.Scanner;

public class NotFrequencia {
Scanner sc = new Scanner(System.in);
public void calcular(){
    System.out.printn(x:"Informe a nota 1 do aluno");
    int nota1 = sc.nextInt();
    System.out.printn(x:"Informe a nota 2 do aluno");
    int nota2 = sc.nextInt(); 
    //Operação Aritmética
    double mediaAluno = nota1+nota2/2;
    //Operações Atribuição
    //MediaAluno= nota1;
    //MediaAluno += nota2;
    //MediaAluno /=2;
    System.out.println("a Media do Aluno é"
    + mediaAluno);
    //Operação Relacional
    boolean mediaAprovada = mediaAluno>=50;
    System.out.println ("O aluno Está Aprovado por Nota? "
    +mediaAprovada);
    System.out.println(x:"Informe a Frequencia do Aluno:");
    int frequenciaAluno = sc.nextInt();
    boolean frequenciaAprovada = frequenciaAluno>=75;
System.out.println("O aluno está Aprovado por Frequencia? "
      +frequenciaAprovada); 
// Operação Lógica
boolean resultadoFinal = (mediaAprovada==true) 
                     && (frequenciaAprovada==true);
System.out.println("O Aluno está aprovado no Curso? "
           +resultadoFinal);

}
}