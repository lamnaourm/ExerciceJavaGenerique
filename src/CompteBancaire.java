
public class CompteBancaire<T> {
	
	private int numero;
	private float solde;
	private T propritaire;
	public CompteBancaire(int numero, float solde, T propritaire) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.propritaire = propritaire;
	}
	
	public CompteBancaire() {
		super();
	}

	@Override
	public String toString() {
		return "CompteBancaire [numero=" + numero + ", solde=" + solde + ", propritaire=" + propritaire + "]";
	}
	
	public static void Transferer(CompteBancaire<?> c1, CompteBancaire<?> c2, float montant) throws Exception {
		
		if(c1.solde < montant){
			throw new Exception("Operation non valide");
		}
		
		c2.solde += montant;
		c1.solde -= montant;
	}

}
