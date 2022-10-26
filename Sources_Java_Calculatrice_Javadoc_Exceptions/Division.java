public class Division extends Operation{

	/**
		Constructeur par défaut
	*/
	public Division() {

	}

	/**
		Constructeur champs à champs
    @param Nombre : Construit le premier oéprande de la classe Division
    @param Nombre : Construit le deuxieme oéprande de la classe Division
	*/
	public Division(Nombre operande1, Nombre operande2){
		super(operande1, operande2);
	}

	/**
		Constructeur par copie
    @param Division : Construit une classe division à l'aide d'une classe déjà créer
    @exception ClassNotFoundException : Léve une exception si la classe que l'on met en paramétre n'existe pas.
	*/
	public Division(Division division){
		try {
      super(division);
    }
    catch (ClassNotFoundException e) {
      System.out.println("La classe utilisée n'existe pas \n" + e.toString() + "\n");
    }
	}

	// Méthodes

	/**
		@return Résultat de la division entre les deux opérandes.
    @exception ArithmeticException : Léve une exception lorsque l'opérande2 est égal à zéro et rend la division impossible
    @exception  NullPointerException : Léve une exception si le résultat du calcul est nul.
	*/
	public int valeur(){
		try {
			return this.getOperande1().valeur() / this.getOperande2().valeur();
		}

		catch (ArithmeticException e){
			System.out.println("Erreur, division par 0 impossible, resultat defini a -1: \n" + e.toString() + "\n");
			return -1;
		}
    catch ( NullPointerException e) {
      System.out.println("Il y a un problème dans l'entrée de votre expression \n" + e.toString()"\n");
    }
	}

	/**
		@return Affiche le calcul suivi du résultat(ici, celui d'une division)
	*/
	public String toString() {
		String s = "(";
		s += this.getOperande1() + " / " + this.getOperande2();
		s += ")";
		return s;
	}
}
