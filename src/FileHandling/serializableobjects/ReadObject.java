package FileHandling.serializableobjects;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) throws IOException {



        //File f= new File("vehicles.dat");
       // f.createNewFile();
        try(FileInputStream fos=new FileInputStream("vehicles.dat")){
            try(ObjectInputStream obj =new ObjectInputStream(fos)){
                Vehicle v1=(Vehicle) obj.readObject();
                Vehicle v2 =(Vehicle) obj.readObject();
                System.out.println(v1 +" and "+v2);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
