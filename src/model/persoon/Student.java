//checked
package model.persoon;

public class Student extends Persoon {

	private int studentNummer;
	private String groepId;

	public Student(
		String pVoornaam, 
		String pTussenvoegsel, 
		String pAchternaam, 
		String pWachtwoord, 
		String pGebruikersnaam,
		Status pStatus,
		int pStudentNummer,
		String groepId) {
		super(
			pVoornaam, 
			pTussenvoegsel, 
			pAchternaam, 
			pWachtwoord, 
			pGebruikersnaam,
			pStatus);
		this.setStudentNummer(pStudentNummer);
		this.setGroepId(groepId);
	}


 public String getGroepId() {
    return this.groepId;	
  }
 
  public void setGroepId(String pGroepId) {
    this.groepId= pGroepId;	
  }
 
	public int getStudentNummer() {
		return this.studentNummer;
	}

	private void setStudentNummer(int pStudentNummer) {
		this.studentNummer = pStudentNummer;
	}
	
}
