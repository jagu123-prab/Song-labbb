public class Song {
    private String genre, artist, songname, topic;
    private double danceability,shakeability,  obsence, loudness; 
    private int release, len;

    public Song (String genre, String artist, String songname, String topic, 
    double danceability, double shakeability, double obsence, double loudness, int release, int len)
    {
        this.genre = genre;
        this.artist = artist;
        this.songname = songname;
        this.topic = topic;
        this.danceability = danceability;
        this.shakeability = shakeability;
        this.obsence = obsence;
        this.loudness = loudness;
        this.release = release;
        this.len = len;
    }

    public String getArtist(){
        return artist; 
    }

    public String getGenre(){
        return genre;
    }

    public String getSongname(){
        return songname;
    }

    public String gettopic(){
        return artist; 
    }

    public double getDanceability(){
        return danceability; 
    }

    public double getShakeability(){
        return shakeability; 
    }

    public double getObscene(){
        return obsence; 
    }

    public double getLoudness(){
        return loudness; 
    }

    public int getRelease(){
        return release; 
    }

    public int getLen(){
        return len; 
    }

    



    

}

