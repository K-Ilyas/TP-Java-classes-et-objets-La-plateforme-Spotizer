public class Cover extends Music {
    
    private Artiste originalArtiste;
    public Cover(String Title, double duration, Visuel viso, String tempo, MusicStyle style, Artiste originalArtiste, Artiste art) {
        super(Title, duration, viso, tempo, style, art);
        this.originalArtiste = originalArtiste;
    }
    public Artiste getOriginalArtiste() {
        return originalArtiste;
    }
    public void setOriginalArtiste(Artiste originalArtiste) {
        this.originalArtiste = originalArtiste;
    }
}
