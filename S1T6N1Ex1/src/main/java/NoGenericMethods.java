public class NoGenericMethods {

    private String nom;
    private String cognom;
    private String alias;


    public NoGenericMethods(String nom, String cognom, String alias){
        this.nom = nom;
        this.cognom =  cognom;
        this.alias = alias;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return this.cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString(){
        return " Nom: " + this.nom + " Cognom: " + this.cognom + " Alias: " + this.alias;
    }
}
