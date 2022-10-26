public class Multiplication extends Operation{

	/**
		Constructeur par défaut
	*/
	public Multiplication() {

	}

	/**
		Constructeur champs à champs
    @param Nombre : Construit le premier oéprande de la classe Multiplication
    @param Nombre : Construit le deuxieme oéprande de la classe Multiplication
	*/
	public Multiplication(Nombre operande1, Nombre operande2){
		super(operande1, operande2);
	}

	/**
		Constructeur par copie
    @param Multiplication : Construit une classe multiplication à l'aide d'une classe déjà créer
    @exception ClassNotFoundException : Léve une exception si la classe que l'on met en paramétre n'existe pas.
	*/
	public Multiplication(Multiplication multiplication){
		try {
      super(multiplication);
    }
    catch (ClassNotFoundException e) {
      System.out.println("La classe utilisée n'existe pas \n" + e.toString() + "\n");
    }
	}

	// Méthodes

	/**
		@return Résultat de la multiplication entre les deux opérandes
    @exception  NullPointerException : Léve une exception si le résultat du calcul est nul.
	*/
	public int valeur() {
    try {
		  return this.getOperande1().valeur() * this.getOperande2().valeur();
      }
    catch ( NullPointerException e) {
      System.out.println("Il y a un problème dans l'entrée de votre expression \n" + e.toString()"\n");
    }
	}

	/**
		@return Affiche le calcul suivi du résultat(ici, celui d'une multiplication)
	*/
	public String toString() {
		String s = "(";
		s += this.getOperande1() + " x " + this.getOperande2();
		s += ")";
		return s;
	}
}
