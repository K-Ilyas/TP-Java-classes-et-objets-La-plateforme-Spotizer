import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class Artiste extends Personne {
    
    public Set<Album> albums = new HashSet<Album>();
    private double earns  = 0d;

    public Artiste(String name, String prenom, String email, String phoneNumber,int j, int m, int a) {
        super(name, prenom, email,phoneNumber,j,m,a);
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void addSongWithoutAlbum(Music music,String visuelName) throws IOException
    {
        Album album = new Album("", new Visuel(visuelName));
        album.addSong(music);
        this.albums.add(album);
    }

    public boolean addAlbum(Album album){
        return this.albums.add(album);
    }
    public boolean addAlbumPersonlize(String name,String chemin,HashSet<Music> songs) throws IOException{
        return this.addAlbum(new Album(name, null, songs));
    }


    public Album getAlbumByName(String name) {
        for (Album alb : albums) {
            if (alb.getName() == name) {
                return alb;
            }
        }
        return null;
    }



    public void addSongToAlbum(Music music,Album album){
        if(this.albums.contains(album)){        
            for (Album alb : albums) {
                if(alb.equals(album)){
                    alb.addSong(music);
                }
            }
        }
    }

    public double getEarns() {
        return earns;
    }

    public void incErans(double earn){
        this.earns += earn;
    }
}
