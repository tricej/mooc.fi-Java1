
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared) {
        // If both objects share the same memory address, return true.
        if (this == compared) {
            return true;
        }

        // If the object being compared is not a Song object, return false.
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the object into a Song object
        Song comparedSong = (Song) compared;

        // If all object values are equal, return true.
        if (this.artist.equals(comparedSong.artist) &&
            this.name.equals(comparedSong.name) &&
            this.durationInSeconds == comparedSong.durationInSeconds
        ) { 
            return true;
        }

        // Otherwise return false.
        return false;
    }



    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
