 public class Remix extends Music{
 
    private Artiste originalArtiste;
    public Remix(String Title, double duration, Visuel viso, String tempo, MusicStyle style, Artiste originalArtiste) {
        super(Title, duration, viso, tempo, style,null);
        this.originalArtiste = originalArtiste;
    }

    public Artiste getOriginalArtiste() {
        return originalArtiste;
    }

    public void setOriginalArtiste(Artiste originalArtiste) {
        this.originalArtiste = originalArtiste;
    }
    
}
