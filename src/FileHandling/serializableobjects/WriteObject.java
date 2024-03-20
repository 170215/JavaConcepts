package FileHandling.serializableobjects;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Vehicle bike= new Vehicle("bike",9444);
        Vehicle car= new Vehicle("Car",4268);

        File f= new File("vehicles.dat");
        f.createNewFile();
        try(FileOutputStream fos=new FileOutputStream("vehicles.dat")){
             try(ObjectOutputStream obj =new ObjectOutputStream(fos)){
                    obj.writeObject(bike);
                    obj.writeObject(car);
             }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
