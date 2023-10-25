public class Music {
    protected String Title;
    protected double duration;
    protected Visuel viso;
    protected String tempo;
    protected MusicStyle style;
    private Artiste artiste;




    // constructor
    public Music(String Title, double duration, Visuel viso, String tempo, MusicStyle style, Artiste art){
        this.Title = Title;
        this.duration = duration;
        this.viso = viso;
        this.tempo = tempo;
        this.style = style;
        this.artiste = art;
    }


    // getter 
    public double getDuration() {
        return duration;
    }
    public MusicStyle getStyle() {
        return style;
    }

    public String getTempo() {
        return tempo;
    }
    public String getTitle() {
        return Title;
    }
    public Visuel getViso() {
        return viso;
    }

    public Artiste getArtiste () {
        return artiste;
    }

    // setter

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setStyle(MusicStyle style) {
        this.style = style;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setViso(Visuel viso) {
        this.viso = viso;
    }


    
     


}
