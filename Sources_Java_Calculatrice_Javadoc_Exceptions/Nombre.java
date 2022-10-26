public class Nombre {

	// Variable d'instance
	private int valeurNombre;

	/**
		Constructeur par défaut
	*/
	public Nombre() {
		this.valeurNombre = 0;
	}

	/**
		Constructeur champs à champs
    @param int : entier quelconque positif ou négatif.
    @exception NumberFormatException : Léve une exception lorsque la variable valeur est une chaîne de caractère et non un entier.
	*/

	public Nombre(int valeur) {
    try {
		  this.valeurNombre = valeur;
      }
    catch(NumberFormatException e) {
        System.out.println("La valeur rentrée n'est pas un nombre \n" + e.toString() + "\n");
	}

  	/**
    Constructeur par copie
    @param Nombre : Définit la classe Nombre à l'aide d'une classe déjà existante.
    @exception ClassNotFoundException : Léve une exception si la classe que l'on met en paramétre n'existe pas.
	*/

	public Nombre(Nombre unNombre){
    try {
		this.valeurNombre = unNombre.getValeurNombre();
    }
    catch(ClassNotFoundException e) {
      System.out.println("La classe utilisée n'existe pas \n" + e.toString() + "\n");
    }
	}

	// Accesseurs

	/**
	@return Retourne la valeur du nombre
	*/
	public int getValeurNombre(){

    return this.valeurNombre;

	// Mutateurs
  	/**
		Permet de modifier la valeur du nombre.
    @param int : Prend en paramétre une valeur et change la valeur actuel de la classe Nombre.
	*/

	public void setValeurNombre(int valeur){
		  this.valeurNombre = valeur;
}
	// Méthodes

	/**
		@return Retourne la valeur du nombre
	*/
	public int valeur(){
		return this.getValeurNombre();
	}

	/**
		@return Retourne une chaîne de caractère qui correspond au nombre
	*/
	public String toString() {
		String s = "";
		s += this.getValeurNombre();
		return s;
	}
}
