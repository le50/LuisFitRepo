
public class Pessoas {
 int id;
 String nome;
 int idade;
	
 
 public Pessoas(int idPar, String nomePar, int idadePar){
		this.id = idPar;
		this.nome = nomePar;
		this.idade = idadePar;
		}
 
 
 //Getters
 public int pegarid(){
	 return id;
 }
 
 public String pegarnome(){
	 return nome;
 }
 
 public int pegaridade(){
	 return idade;
 }
 
 //Setters
 public void alterarid(int idPar){
	 this.id = idPar;
 }
 
 public void alterarnome(String nomePar){
	 this.nome = nomePar;
 }
 
 public void alteraridade(int idadePar){
	 this.idade = idadePar;
 }
}
