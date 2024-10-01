package Atividade;

public class App {
	public static void main() {
		Usuario u1= new Usuario();
		
		
		
		try {
			u1.setNome("Antonio");
			u1.setIdade(20);
			
			
		}
		catch (IdadeInvalidaException ex) {
			System.out.println( ex.getMessage()+ "A idade digitada tem um valor invalido, digite uma idade entre 18~100");
		}
		catch (NomeInvalidoException e) {
			System.out.println(e.getMessage()+ "O nome não pode ser vazio nem pode ser nulo");
		}
		
		
		System.out.println("IMPRESSAO DE DADOS DO USUARIO: ");
		u1.toString();
		
		
	}

}
