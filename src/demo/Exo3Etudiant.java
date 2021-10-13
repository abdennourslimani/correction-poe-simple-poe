package demo;

public class Exo3Etudiant {
    String nom ;
    int[] note ;
    double moyenne ;
/*
    public  void   calcMoyenne(int note1,int note2){
        this.note1 = note1;
        this.note2 = note2;
        moyenne = (note1+note2)/ 2;
    }

 */
    public  void   calcMoy(int... note){
         note = new int[note.length];
        for (int i=0 ;i< note.length;i++){
            this.note[i] = note[i];
            moyenne += (note[i]/ note.length);
        }


    }



    public void show(String nom){
        this.nom = nom ;
        System.out.println(nom + "votre moyenne est de " + moyenne);
    }



}
