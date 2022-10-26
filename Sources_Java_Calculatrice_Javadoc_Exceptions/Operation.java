public abstract class Operation {

	// Variables d'instance
	private Nombre operande1;
	private Nombre operande2;

	/**
		Constructeur par défaut
	*/
	public Operation() {

	}

	/**
		Constructeur champs à champs
    @param Nombre : Construit le premier oéprande de la classe Nombre
    @param Nombre : Construit le deuxieme oéprande de la classe Nombre
	*/
	public Operation(Nombre operande1, Nombre operande2){
		this.operande1 = operande1;
		this.operande2 = operande2;
	}

	/**
		Constructeur par copie
    @param Operation : Permet de construire une nouvelle classe opération à l'aide d'une autre classe déjà existante
    @exception ClassNotFoundException : Léve une exception si la classe que l'on met en paramétre n'existe pas.
	*/
	public Operation(Operation operation){
    try {
		  this.operande1 = operation.getOperande1();
		  this.operande2 = operation.getOperande2();
    }
    catch (ClassNotFoundException e) {
      System.out.println("La classe utilisée n'existe pas \n" + e.toString() + "\n");
    }
	}

	// Accesseurs

	/**
		@return Retourne la valeur de la première opérande de l'opération
	*/
	public Nombre getOperande1(){
		return this.operande1;
	}

	/**
		@return Retourne la valeur de la deuxième opérande de l'opération
	*/
	public Nombre getOperande2(){
		return this.operande2;
	}

	// Mutateurs

	/**
		Permet de modifier la valeur de la première opérande
    @param Nombre : Prend en paramétre une valeur et change la valeur actuel l'opérande1
	*/
	public void setOperande1(Nombre valeur){
		this.operande1 = valeur;
	}

	/**
		Permet de modifier la valeur de la deuxième opérande
    @param Nombre : Prend en paramétre une valeur et change la valeur actuel l'opérande2
	*/
	public void setOperande2(Nombre valeur){
		this.operande2 = valeur;
	}

	// Méthode
	/**
		Méthode abstraite donnant le résultat de l'opération,
		qui sera précisé par redéfinition dans la classe associé.
    @return Retourne un int de la valeur
	*/
	public abstract int valeur();

}
