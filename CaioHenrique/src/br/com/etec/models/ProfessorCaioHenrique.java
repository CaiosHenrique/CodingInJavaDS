package br.com.etec.models; //CaioHenrique

public class ProfessorCaioHenrique extends PessoaCaioHenrique {

	public String materia;
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getFaculdade() {
		return faculdade;
	}
	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	public boolean isFreelancer() {
		return freelancer;
	}
	public void setFreelancer(boolean freelancer) {
		this.freelancer = freelancer;
	}
	public String faculdade;
	public boolean freelancer;
	
}
