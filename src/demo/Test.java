package demo;

import java.util.Scanner;

public class Test {



    public static void main(String[] args){

        /* EXO 01 RECTANGLE
        EXO1RECTANGLE rectangle1 = new EXO1RECTANGLE();
        rectangle1.longueur = 10 ;
        rectangle1.largeur = 10 ;
        double surface = rectangle1.surface();
        System.out.println(surface);
        */

        // EXO 02 Somme
    /*
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer premiere valeur ");
        double input1 = sc.nextInt();
        System.out.println("entrer deuxieme valeur ");
        double input2  = sc.nextInt();

        EXO2SOMME sum = new EXO2SOMME(input1, input2) ;



        double somme = sum.somme();
        System.out.println(somme);
    */
        // EXO 03  :Scanner sc = new Scanner(System.in);
        /*Scanner sc = new Scanner(System.in);

        System.out.println("votre nom ");
        String input1 = sc.nextLine() ;
        System.out.println("entrer premiere note");
        int input2  = sc.nextInt();
        System.out.println("entrer deuxieme note");
        int input4  = sc.nextInt();
        System.out.println("entrer deuxieme note");
        int input5  = sc.nextInt();
        System.out.println("entrer deuxieme note");
        int input6  = sc.nextInt();
        System.out.println("entrer deuxieme note");
        int input7  = sc.nextInt();

        Exo3Etudiant etudiant = new Exo3Etudiant();

        etudiant.calcMoy(input2,input4,input5,input6,input7);

        etudiant.show(input1 );
        */

        // EXO 04 :
        /*
        Scanner sc = new Scanner(System.in);

        // nombre 1
        System.out.println("Nombre 1");
        System.out.println("entrez partie reelle ");

        int reel1 = sc.nextInt() ;
        System.out.println("entrez partie imaginaire");

      int imaginaire1= sc.nextInt() ;

         // nombre 2
        System.out.println("Nombre 2");
        System.out.println("entrez partie reelle ");

        int reel2 = sc.nextInt() ;
        System.out.println("entrez partie imaginaire");

        int imaginaire2= sc.nextInt()  ;

        EXO4ADDITION nombre1 = new EXO4ADDITION() ;

        int reel = nombre1.sommeReel(reel1,reel2) ;
        int imaginaire = nombre1.sommeImaginaire(imaginaire1,imaginaire2);

         nombre1.somme(imaginaire,reel);
        */

         // EXO 5
            /*
            Exo5Point p1 = new Exo5Point(5,6);
            Exo5Point p2 = new Exo5Point();
            p2.x = 3;
            p2.y =2;

             System.out.println(p2);

            double result =p1.distance(p2);

        System.out.println(result);
                */
        /*
        etudiant 2 .
         */
        /*
        Person person = new Person();
        person.sayHello();

        Student student = new Student();
        student.setAge(15);
        student.sayHello();
        student.displayAge();
        student.goToClass();

        Teacher teacher = new Teacher() ;
        teacher.setAge(40);
        teacher.sayHello();
        teacher.explain();
        */

        // EXO 07 :

        Personn person = new Personn("thomas");
        person.display();

        Apartment apartment = new Apartment(50);
        apartment.nom = "apartment";

        apartment.door.getColor();

        apartment.display();







    };



}
