public class CalculatriceSimple {
    Nombre deux = new Nombre(2);
    Nombre trois = new Nombre(3);

    //Retourne 5
    Operation add = new Addition(deux,trois);

    add.valeur();
}