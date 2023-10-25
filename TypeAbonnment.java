enum TypeAbonnment{
    STANDARD ("standard",0.02f,66),
    PREMIUM ("premuim",0.03f,66);

    private String name ;
    private float price ;
    private int artisteCommision;

    TypeAbonnment(String name,float price,int artisteCommision){
        this.name = name;
        this.price = price;
        this.artisteCommision = artisteCommision;
    }

    public int getArtisteCommision() {
        return artisteCommision;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}







