import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Utilisateur extends Personne {
    private static final Set<String> names = new HashSet<String>();
    private Set<PlayList> playlists = new HashSet<PlayList>();
    private double durationPlayed;
    private TypeAbonnment type;

    public Utilisateur(String name, String prenom, String email, String phoneNumber, int j, int m, int a, TypeAbonnment type) {
        super(name, prenom, email, phoneNumber, j, m, a);
        this.type = type;
    }
    // getter
    public Set<PlayList> getPlayLists() {
        return playlists;
    }

    // setter
    public void setPlayList(Set<PlayList> playlist) {
        this.playlists = playlist;
    }

    // methods
    public boolean MakePlayList(String name) {
        if (names.contains(name))
            return false;
        if (name != null)
            names.remove(name);
        names.add(name);
        PlayList playlist = new PlayList(name);
        playlists.add(playlist);
        return true;
    }

    public PlayList getPlayListsByName(String name) {
        for (PlayList playl : playlists) {
            if (playl.getName() == name) {
                return playl;
            }
        }
        return null;
    }

    public boolean addSongToPlayList(String name, Music song) {
        for (PlayList playl : playlists) {
            if (playl.getName() == name) {
                return playl.addSong(song);
            }
        }
        return false;
    }

    public boolean removeSongFromPlayList(String name, Music song){
        for (PlayList playl : playlists) {
            if (playl.getName() == name) {
                return playl.removeSong(song);
            }
        }
        return false;
    }

    public Set<Music> getSongsInPlayList(PlayList play) {
        return play.getSongs();
    }

    public void SongPlayed(Music song,int duration) {
        this.durationPlayed += durationPlayed;
        Artiste art = song.getArtiste();
        double gain = (66 * (this.durationPlayed*type.getPrice())/300)/100;
        art.incErans(gain);
    }   
    public void SongPlayed(Music song) {
        this.durationPlayed += song.getDuration();
        Artiste art = song.getArtiste();
        double gain = (66 * (this.durationPlayed*type.getPrice())/300)/100;
        art.incErans(gain);
    }   


    public double calcFacture() {
        return (this.durationPlayed*type.getPrice())/300;
    }


    // @Override 

}
