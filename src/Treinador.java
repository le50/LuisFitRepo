
public class Treinador extends Pessoas{

	String especialidade;
	
	public Treinador(int idPar, String nomePar, int idadePar, String especialidadePar){
		super(idPar, nomePar, idadePar);
		
		this.especialidade = especialidadePar;
		}
	
		public String getEspecialidade(){
			 return especialidade;
		 }
		 

		 public void setEspecialidade(String especialidadePar){
			 this.especialidade = especialidadePar;
		 }
}
