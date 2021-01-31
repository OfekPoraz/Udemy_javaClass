import java.util.ArrayList;
import java.util.LinkedList;

public class Album1 {

    private String artist;
    private String name;
    private SongList songs;

    public Album1(String artist, String name) {
        this.artist = artist;
        this.name = name;
        this.songs = new SongList();
    }


    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private Song findSong(String name){
            for (Song song : this.songs){
                if (song.getTitle().equals(name)){
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int index){
            int i = index -1;
            if((i >= 0) && (i <= this.songs.size())) {
                if (this.songs.get(i).getTitle() != null){
                    return songs.get(i);
                }

            }
            return null;
        }

        public boolean add(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }
    }

}
