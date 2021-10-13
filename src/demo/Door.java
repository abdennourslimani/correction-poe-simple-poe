package demo;

public class Door {
    String color ;

    public void display(){
        System.out.println("je suis une porte ma couleur est "+color);
    }

    public String getColor(){
        String  color= this.color ;
        return color;
    }

    public void setColor(String color){
        this.color=color ;
    }


}
