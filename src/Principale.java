import java.time.LocalDate;

public class Principale {

	public static void main(String[] args) throws Exception {
		
		Particulier p = new Particulier("2323","sdasas",LocalDate.of(1922, 2, 3));
		Entreprise e = new Entreprise("CGI","Rabat",21212);
		
		CompteBancaire<Particulier> compte1 = new CompteBancaire<>(1,2300,p);
		CompteBancaire<Entreprise> compte2 = new CompteBancaire<>(2,230000,e);
		
		
		CompteBancaire.Transferer(compte2, compte1, 300f);
		
		System.out.println("Compte 1:" + compte1);
		System.out.println("Compte 2:" + compte2);

	}

}
