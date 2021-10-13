package demo;

public class Personn {
    House house ;
    String nom ;

    public Personn(String nom){
        this.nom=nom ;
    }

    public void display(){
        System.out.println("je m'appelle "+ nom );

        System.out.println(nom+ " donnée maison" + " donnée porte maison");

    }



}
