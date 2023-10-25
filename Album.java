import java.util.HashSet;
import java.util.Set;

public class Album {

    private String name;
    private Visuel visuel;
    public static Set<String> uniqueNames = new HashSet<String>();
    public static int nbAlbum = 1;
    private Set<Music> songs = new HashSet<Music>();

    public Album(String name, Visuel visuel) {

        this.setName(name);
        this.visuel = visuel;
        nbAlbum++;
    }

    public Album(String name, Visuel visuel, HashSet<Music> songs) {
        this(name, visuel);
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public Visuel getVisuel() {
        return visuel;
    }

    public void setName(String name) {
        if (Album.uniqueNames.contains(name)) {
            this.name = "Album N_" + Album.nbAlbum;
        } else {
            this.name = name;
            Album.uniqueNames.add(name);
        }
    }

    public void setVisuel(Visuel visuel) {
        this.visuel = visuel;
    }

    public boolean addSong(Music song) {
        return this.songs.add(song);
    }

    public boolean removeSong(Music song) {
        return this.songs.remove(song);
    }

}
