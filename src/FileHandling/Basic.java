package FileHandling;

import java.io.*;

public class Basic {
    public static void main(String[] args) {
        File file=new File("C:\\C#\\demo.txt");
        File dr= new File("C:\\C#\\demo");
        dr.mkdir();
        dr = new File("team.txt");
        try{

        file.createNewFile();
        dr.createNewFile();
        System.out.println("File Created");
        }
        catch(IOException e){
            System.out.println("error occured, while creating the file");
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(dr))){
            bw.write("chaand");
            bw.newLine();
            bw.write("shabaz");
            bw.newLine();
            bw.write("salim");
            bw.newLine();
            bw.write("aarti");
            bw.newLine();
            System.out.println("Writting on to the file completed");
            bw.close();
        } catch (Exception e) {
            System.out.println("error occured ,while creating writting onto the file");
        }

        try(BufferedReader br = new BufferedReader(new FileReader(dr))){
            String line;
            while((line=br.readLine()) !=null){
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
