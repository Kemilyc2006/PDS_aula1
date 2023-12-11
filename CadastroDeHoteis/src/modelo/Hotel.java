package modelo;

public class Hotel {

	
		private String nome;
		private int cep;
		private int telefone;
		private String email; 
		private String cidade; 
		private int numQuartos; 
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getCep() {
			return cep;
		}
		public void setCep(int cep) {
			this.cep = cep;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone; 
		}
		public int getTelefone() {
			return telefone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public int getNumQuartos() {
			return numQuartos;
		}
		public void setNumQuartos(int numQuartos) {
			this.numQuartos = numQuartos;
		}
		
		
		

	
}
