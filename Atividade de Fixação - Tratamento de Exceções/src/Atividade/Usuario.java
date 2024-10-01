package Atividade;

public class Usuario {
	private String nome;
	private int idade;
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws NomeInvalidoException {
		
			if(this.nome.isEmpty()||this.nome.trim().equals("")) {
			throw new NomeInvalidoException("O nome esta invalido. ");
			
			}
			else 
			{
			this.nome = nome;
			}
			
			
	}
		
		
		
		
		
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) throws IdadeInvalidaException{
		
			if(idade>100||idade<18) {
				throw new IdadeInvalidaException("A idade invalida. ");
			}else {
				this.idade = idade;
			}
		
			
	}
		
		
		
		
	}
	
	

