
public class Atleta extends Pessoas{

	String modalidade;
	
	
	
	public Atleta(int idPar, String nomePar, int idadePar, String modalidadePar){
		super(idPar, nomePar, idadePar);
		
		this.modalidade = modalidadePar;
		}
	
	
	public String getModalidade(){
		 return modalidade;
	 }
	 

	 public void setModalidade(String modalidadePar){
		 this.modalidade = modalidadePar;
	 }
	 
	 @Override
	 	public void mostrarInformacoes(){
		 System.out.println("Dados do Atletas"); //sysout ctrl + space
		 super.mostrarInformacoes();
		 System.out.println("__________________");
	 	}
}
