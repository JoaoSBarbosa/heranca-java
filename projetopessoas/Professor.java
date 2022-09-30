package projetopessoas;

public class Professor extends Pessoa {

	private String especialidade;
	private double salario;

	// Métodos
	public void receberAumento(double aumento) {

		this.salario += aumento;

	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
