import java.util.Set;
import java.util.HashSet;
public class PlayList {
    private String name;
    private Set<Music> musics = new HashSet<Music>();

    

    public PlayList(String name, Set<Music> musics){
        this.name = name;
        this.musics = musics;
    }
    public PlayList(String name){
        this.name = name;
    }

    //getter
    public Set<Music> getSongs () {
        return this.musics;
    }
    public String getName (){
        return this.name;
    }

    //setter



    public boolean addSong (Music song) {
        return this.musics.add(song);
    }
    public void addSongs(Set<Music> songs){
        for (Music song : songs) {
            musics.add(song);
        }
    }
    public int getPlayListsSize () {
        return this.musics.size();
    }
    public boolean removeSong(Music song) {
        return this.musics.remove(song);
    }
    
    
}