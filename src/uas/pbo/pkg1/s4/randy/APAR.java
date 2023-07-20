package uas.pbo.pkg1.s4.randy;

/**
 *
 * @author Achmad Randy Al Mugni Fauzi 2110010285
 */
public class APAR {
    //atribut dan encapulation
    private String id;
    private String lokasi;

    //constructor
    public APAR(String id, String lokasi) {
        this.id = id;
        this.lokasi = lokasi;
    }
    
    //mutator
    public void setId(String id) {
        this.id = id;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    //accessor
    public String getId() {
        return id;
    }

    public String getLokasi() {
        return lokasi;
    }
    
    public String displayInfo(){
        return "ID :"+getId()+
               "\nLokasi "+getLokasi();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String status){
       return displayInfo() + "\nStatus: "+status;
    }

    
}
