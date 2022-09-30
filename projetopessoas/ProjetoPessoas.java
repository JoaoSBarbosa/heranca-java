package projetopessoas;

import java.util.Locale;
import java.util.Scanner;

public class ProjetoPessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Carlos");
		p1.setSexo("Masculino");
		p1.setIdade(28);
		
		p2.setNome("Maria");
		p2.setIdade(30);
		p2.setSexo("Masculino");
		
		p3.setNome("Marta");
		p3.setSalario(3000.00);
		p3.receberAumento(200);
		p3.setEspecialidade("Sistema");
		p3.setIdade(31);
		p3.setSexo("Feminino");
		
		p4.setNome("Lucas");
		p4.setIdade(18);
		p4.setSetor("Logistica");
		p4.setTrabalhando(false);
		p4.setSexo("Masculino");
		
		System.out.print("------ALUNOS-----\n");
		
		System.out.print("Nome: ");
		p2.setNome(sc.next());
		System.out.print("Matricula: ");
		p2.setMatricula(sc.nextInt());
		System.out.print("Curso: ");
		p2.setCurso(sc.next());
		
		
	
	
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		p2.cancelarMatricula();
		
		
	sc.close();

	}

}
