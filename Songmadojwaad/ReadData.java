import java.util.Scanner;
import java.io.File;
import java.io.IOException; 


public class ReadData {
    public static void main(String[] args) {
    Song [] song = new Song[28372]; 
    Scanner in; 

    try {
        int count =1; 
        in = new Scanner(new File ("songs 2025-2026 ANSI (1).csv"));
      
        
        while (in.hasNext()){
            String line = in.nextLine()
            String artist = line.split(",")[0];
            String songname = line.split(";")[1];
            int release = Integer.parseInt(line.split(";")[2]); 
            String genre = line.split(",")[3];
            int len = Integer.parseInt(line.split(";")[4]);
            double shakeability = Double.parseDouble(line.split(";")[5]);
            double obsence = Double.parseDouble(line.split(";")[6]);
            double danceability = Double.parseDouble(line.split(";")[7]);
            double loudness = Double.parseDouble(line.split(";")[8]);
            String topic = line.split(",")[9];

            //public Song (String genre, String artist, String songname, String topic, 
                //double danceability, double shakeability, double obsence, double loudness, int release, int len)
            song [count] = new Song(genre, artist, songname, topic, danceability, shakeability,obsence, loudness, release, len); 
            count ++; 
        }
        System.out.println(Song [].getSongname()); 
    
    in.close();
    }

    catch (IOException e) {
        System.out.println(e);
    }
}


    

}
