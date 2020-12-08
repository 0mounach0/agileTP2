package models;

import java.util.ArrayList;

public class Rider {

    //private final RefactoringTest refactoringTest = new RefactoringTest(this);
    // variables d'instance -
    private String fullname;


    private ArrayList<Moto> myMoto;

    /**
     * Constructeur d'objets de classe Moto
     */
    public Rider()
    {
        // initialisation des variables d'instance
        this.myMoto = new ArrayList<Moto>();
        this.fullname = "";
    }

    // constructeur avec params
    public Rider(String f)
    {
        // initialisation des variables d'instance
        this.myMoto = new ArrayList<Moto>();
        this.fullname = f;
    }

    // getteur fullname
    public String getFullname(){
        return this.fullname;
    }

    //setteur fullname
    public void setFullname(String f){
        this.fullname = f;
    }

    // getteur moto
    public ArrayList<Moto> getMyMoto(){
        return this.myMoto;
    }

    //setteur moto
    public void setMyMoto(ArrayList<Moto> m){
        this.myMoto = m;
    }

    //setteur moto
    public void addMoto(Moto m){
        this.myMoto.add(m);
    }

    /**
     * function returns object infos
     */
    public String toString()
    {
        return "Rider fullname : " + this.fullname;
    }

    public String toString_myMoto()
    {

        return "My Motos : " + this.getMyMoto().toString();
    }

}
