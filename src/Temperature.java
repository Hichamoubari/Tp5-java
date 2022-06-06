public class Temperature {

    double temperature;
    String unite;

    public Temperature(){
        this.temperature=0;
    }
    public Temperature(double temperature, String unite){
        this.temperature=temperature;
        this.unite=unite;
    }
    public Temperature(double temperature){
        this.temperature=temperature;
    }
    public void affTemperature() {
        System.out.println(this.temperature);
    }
    public void affUnite() {
        System.out.println(unite);
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setUnite(String unite) {
        this.unite = unite;
    }
    public void conversionKC(){
        double Tc=0;
        if(unite=="Kelvin"){
            Tc = this.temperature - 213.15;
            this.temperature=Tc;
            this.unite="Celsius";
        }
    }
    public void conversionCF(){
        double TF=0;
        //On converte si la température initiale est en Celsius
        if(unite=="Celsius"){
            TF = 9/5*this.temperature + 32;
            this.temperature=TF;
            this.unite="Fahrenheit";
        }
    }
    boolean estegale(Temperature T2){

        if(this.unite==T2.unite && this.temperature==T2.temperature)
            return true;

        return false;
    }
    void plusGrande(Temperature T2){
        //tester si les unités sont égaux
        if(this.unite==T2.unite){
            if(this.temperature==T2.temperature)
                System.out.println("T1("+this.unite+", "+this.temperature+") est plus grande que "+
                        "T2("+T2.unite+", "+T2.temperature+")");
            else
                System.out.println("T2("+T2.unite+", "+T2.temperature+") est plus grande que "+
                        "T1("+this.unite+", "+this.temperature+")");
        }
    }

    public static void main(String[] args) {
        Temperature T1 = new Temperature(16, "Casablanca");
        Temperature T2 = new Temperature(238.4, "Tanger");
        T1.affUnite();
        T1.affTemperature();
        T2.affUnite();
        T2.affTemperature();

        T2.conversionKC();

        T1.plusGrande(T2);
    }
}
