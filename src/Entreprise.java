
public class Entreprise {

	private String raison;
	private String adresse;
	private double capital;

	public String getRaison() {
		return raison;
	}

	public void setRaison(String raison) {
		this.raison = raison;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public Entreprise(String raison, String adresse, double capital) {
		super();
		this.raison = raison;
		this.adresse = adresse;
		this.capital = capital;
	}

	public Entreprise() {
		super();
	}

	@Override
	public String toString() {
		return "Entreprise [raison=" + raison + ", adresse=" + adresse + ", capital=" + capital + "]";
	}

}
