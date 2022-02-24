
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		Gerente gerente = new Gerente();
		
		gerente.setNome("teste");
		gerente.setSalario(3000);
		
		System.out.println("A bonificação do gerente eh: " + gerente.getBonificacao());
		
		
		nico.setNome("Nico Steppat");
		nico.setCpf("12123213");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
