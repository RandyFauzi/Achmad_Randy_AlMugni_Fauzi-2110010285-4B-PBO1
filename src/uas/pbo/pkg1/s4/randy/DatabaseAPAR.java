package uas.pbo.pkg1.s4.randy;
/**
 *
 * @author Achmad Randy Al Mugni Fauzi 2110010285
 */
//inheritance
public class DatabaseAPAR extends APAR {
    //overriding
    public DatabaseAPAR(String id, String lokasi) {
        super(id, lokasi);
    }
   
    public int getNoGedung() {
        return Integer.parseInt (getId().substring(0, 1)) + 001;                
    }
    //seleksi if
    public String getNamaGedung () {
        String kodeLok = getId().substring(2, 4);
        if(kodeLok.equals(01)){ 
            return "Office SHE";
        } else {
            return "Gedung Utama";
        }
    }
    
    public String getArea(){
        String kodeArea = getId().substring(4, 6);
        //seleksi switch
        switch(kodeArea){
            case "01":
                return "Area Kanan";
            case "02":
                return "Area Kiri";
            default:
                return "Area Sekitar";
        }    
    }
    
    public int getNoDaftar(){
        return Integer.parseInt(getId().substring(6));
    }
        
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super .displayInfo()+
                "\nNo Gedung: "+getNoGedung()+
                "\nNama Gedung: "+getNamaGedung()+
                "\nArea: "+getArea()+
                "\nNo Dafatar: "+getNoDaftar();
        
    }
    
}
 

