package projetopessoas;

public class Funcionario extends Pessoa {

	private String setor;
	private boolean trabalhando;

	// Métodos
	public void mudarTrabalho() {
		this.trabalhando = !this.trabalhando;
		if (trabalhando == false) {
			System.out.println("Funcionario em intervalo");

		} else {
			System.out.println("Funcionario trabalhando");
		}
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

}
