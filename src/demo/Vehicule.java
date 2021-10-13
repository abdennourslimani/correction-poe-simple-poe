
package demo;

public class Vehicule {

public String couleur ;
public String marque ;
public double prix ;

    public  Vehicule (){
        System.out.println("pasasge par le constructeur");
        System.out.println(this.couleur="balnce");
    }
    public  Vehicule (String couleur,String marque , double prix ){
        this.marque = marque ;
        this.prix = prix ;
    }
    public  Vehicule (String marque , double prix ){
      this.marque = marque ;
      this.prix = prix ;
    }


    public void repeindre(String couleur){
             this.couleur = couleur ;
    }


    @Override
    public String toString() {
        return "Vehicule{" +
                "couleur='" + couleur + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }
}
