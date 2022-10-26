public class Soustraction extends Operation{

	/**
		Constructeur par défaut
	*/
	public Soustraction() {

	}

	/**
		Constructeur champs à champs
    @param Nombre : Construit le premier oéprande de la classe Soustraction
    @param Nombre : Construit le deuxieme oéprande de la classe Soustraction
	*/
	public Soustraction(Nombre operande1, Nombre operande2){
		super(operande1, operande2);
	}

	/**
		Constructeur par copie
    @param Soustraction : Construit une classe soustraction à l'aide d'une classe déjà créer
    @exception ClassNotFoundException : Léve une exception si la classe que l'on met en paramétre n'existe pas.
	*/
	public Soustraction(Soustraction soustraction){
		try {
      super(soustraction);
    }
    catch (ClassNotFoundException e) {
      System.out.println("La classe utilisée n'existe pas \n" + e.toString() + "\n");
    }
	}

	// Méthodes

	/**
		@return Résultat de la soustraction entre les deux opérandes
    	@exception  NullPointerException : Léve une exception si le résultat du calcul est nul.
	*/
	public int valeur() {
    try {
		    return this.getOperande1().valeur() - this.getOperande2().valeur();
    }
    catch ( NullPointerException e) {
      System.out.println("Il y a un problème dans l'entrée de votre expression \n" + e.toString()"\n");
    }
	}

	/**
		@return Affiche le calcul suivi du résultat(ici, celui d'une soustraction)
	*/
	public String toString() {
		String s = "(";
		s += this.getOperande1() + " - " + this.getOperande2();
		s += ")";
		return s;
	}
}
