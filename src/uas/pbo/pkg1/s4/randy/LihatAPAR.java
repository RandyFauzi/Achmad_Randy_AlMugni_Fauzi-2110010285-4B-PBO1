package uas.pbo.pkg1.s4.randy;
/**
 *
 * @author Achmad Randy Al Mugni Fauzi 2110010285
 */
import java.util.Scanner;

public class LihatAPAR {
    public static void main(String [] args) {
        //objek
        //APAR dbApar = new APAR ("APAR01001","Office SHE");
        
        //System.out.println(dbApar.displayInfo());
        //System.out.println(dbApar.displayInfo("Tersedia"));
       
        //error handdling
        try{
            //IO Sederhana
            Scanner scanner = new Scanner (System.in);

            //Array
            DatabaseAPAR[] dbApar = new DatabaseAPAR[2];

            //perulangan
            for(int i=0; i<dbApar.length; i++){
                System.out.print("Masukan ID APAR "+(i+1)+": ");
                String APAR = scanner.nextLine();
                System.out.print("Masukan Lokasi APAR "+(i+1)+": ");
                String lokasi = scanner.nextLine();

                //objek
                dbApar[i] = new DatabaseAPAR (APAR, lokasi);
            }   
            //perulangan 
            for(DatabaseAPAR data: dbApar){
                System.out.println("===================");
                System.out.println("Data APAR: ");
                System.out.println(data.displayInfo());
             }
        } catch (NumberFormatException e){
            System.out.println("ID Kurang: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
                  System.out.println("APAR Tidak Ada!: "+e.getMessage());
        } 
        catch(Exception e) {
            System.out.println("Kesalahan Kode: "+e.getMessage());
        }
    
    }
}
