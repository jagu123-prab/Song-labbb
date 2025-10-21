public class Driver {
    public static void main(String [] args){
        ReadData r = new ReadData();
        r.read();
        Song [] mySongs = r.read();
        
        System.out.println(r.read());

    }
}
