public class Persona2 {


    private String nom;
    private String cognom;
    private int edat;

    public Persona2(){

    }

    public Persona2(String nom,String cognom,int edat){

        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;

    }

    public String getNom(){

        return this.nom;
    }
    public String getCognom(){

        return this.cognom;
    }
    public int getEdat(){

        return this.edat;
    }
    public void setNom(String nom){

        this.nom = nom;
    }
    public void setCognom(String cognom){

        this.cognom = cognom;
    }

    public void setEdat(int edat){

        this.edat= edat;
    }

    public String toString(){
        return "Nombre: " + this.nom + " " + "Apellido: " + this.cognom + " " + "Edat: " + this.edat;
    }

}
