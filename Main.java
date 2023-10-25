import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Artiste> artistes = new ArrayList<Artiste>();
        ArrayList<Utilisateur> users =  new ArrayList<Utilisateur>();
        
        for (int i=0;i<=5;i++) {
            artistes.add(new Artiste("artiste"+i,"othername"+i,"exemple"+i+"@mail"+i+".com","+33"+i,5,5,1978));
      
        }
        int choix = 0;
         for (int i=0;i<=5;++i){    
            users.add(new Utilisateur("artiste"+i,"othername"+i,"exemple"+i+"@mail"+i+".com","+33"+i,5,5,1978, choix % 2  == 0 ? TypeAbonnment.PREMIUM : TypeAbonnment.STANDARD));
        }



        Music song1 = new Music("Don't kill me pls", 250, null, "tempo exemple",MusicStyle.METAL,artistes.get(0));
        Music song2 = new Music("Don't pls", 325, null, "tempo exemple",MusicStyle.JAZZ,artistes.get(1));
        Music song3 = new Music("Don't kill", 100, null, "tempo exemple",MusicStyle.METAL,artistes.get(3));
        Music song4 = new Music("me pls", 200, null, "tempo exemple",MusicStyle.METAL,artistes.get(2));
        Music song5 = new Music("Don't kill", 100, null, "tempo exemple",MusicStyle.METAL,artistes.get(2));
        Music song6 = new Music("me pls", 200, null, "tempo exemple",MusicStyle.METAL,artistes.get(3));

        // Set<String> set = new HashSet<>(Arrays.asList(song1, song2));

 
        
        artistes.get(0).addAlbumPersonlize("get lost","~/images/a.jpg", new HashSet<Music>(Arrays.asList(song1,song2)));
        artistes.get(1).addAlbumPersonlize("Dmy dome","~/images/a.jpg",new HashSet<Music>(Arrays.asList(song3,song4)));
        artistes.get(2).addAlbumPersonlize("Wow","~/images/a.jpg",new HashSet<Music>(Arrays.asList(song5,song6)));
       


        users.get(0).MakePlayList("France Music");
        users.get(0).addSongToPlayList("Frace Music", song1);
        users.get(0).addSongToPlayList("Frace Music", song2);
        users.get(0).addSongToPlayList("Frace Music", song3);

        users.get(0).SongPlayed(song1);
        

        System.out.println(users.get(0).calcFacture());


        

        



    
    
    
    
    }
}
