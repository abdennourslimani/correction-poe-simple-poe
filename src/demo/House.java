package demo;

public class House {
private  int surface ;
    Door door ;
    String nom ;


    public House(int surface){
        this.surface = surface;
    }

    public int getSurface(){
        int surface = this.surface ;
        return surface;
    }

    public void setSurface(int surface){
        this.surface=surface ;
    }


    public void display(){
        System.out.println("je suis un "+ nom + ", ma surface est de "+ surface +" m2");
    }

    public Door GetDoor(){
        Door door = this.door;
        return door;
    }


}
