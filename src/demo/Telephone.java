package demo;

public class Telephone {

    String marque ;
    String couleur ;
    String modele ;
    double prix ;

    public Telephone(){

    }
    public Telephone(String marque , String modele , String couleur, double prix){
        this.marque = marque ;
        this.couleur= couleur ;
        this.modele = modele ;
        this.prix=prix ;
    }
    public void envoyerMessage(String message){
        System.out.println(message);

    }
    public void appeler(String destinataire){
        System.out.println("je suis en train d'appeler" + destinataire);

    }

    @Override
    public String toString() {
        return "Telephone{" +
                "marque='" + marque + '\'' +
                ", couleur='" + couleur + '\'' +
                ", modele='" + modele + '\'' +
                ", prix=" + prix +
                '}';
    }
}
