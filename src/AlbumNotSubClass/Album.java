import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String artist;
    private String name;
    private ArrayList<Song> songs;

    public Album(String artist, String name) {
        this.artist = artist;
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String name){
        for (Song song : this.songs) {
            if (song.getTitle().equals(name)) {
                return song;
            }
        }
        return null;
    }

    public boolean addSong(String name, double duration){
        if (findSong(name) == null){
            this.songs.add(new Song(name, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int index, LinkedList<Song> playList){
        int i = index -1;
        if((i >= 0) && (i <= this.songs.size())) {
            if (this.songs.get(i).getTitle() != null){
                playList.add(this.songs.get(i));
                return true;
            }

        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }
}
