
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		String nome = g1.getNome();
		System.out.println(nome);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
		Diretor d = new Diretor();
		d.setSalario(10000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(funcionario);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}

}
