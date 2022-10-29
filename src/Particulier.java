import java.time.LocalDate;

public class Particulier {

	private String cin;
	private String nom;
	private LocalDate date;

	public Particulier() {
		super();
	}

	public Particulier(String cin, String nom, LocalDate date) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.date = date;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Particulier [cin=" + cin + ", nom=" + nom + ", date=" + date + "]";
	}

}
