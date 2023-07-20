# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data APAR pada Kantor menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa id dan lokasi APAR, dan memberikan output berupa informasi detail dari ID tersebut seperti No Gedung, Nama Gedung, Area, dan nomor Daftar.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mahasiswa`, `MahasiswaDetail`, dan `MahasiswaBeraksi` adalah contoh dari class.

```bash
public class Mahasiswa {
    ...
}

public class MahasiswaDetail extends Mahasiswa {
    ...
}

public class MahasiswaBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `dbApar[i] = new DatabaseAPAR(id, lokasi);` adalah contoh pembuatan object.

```bash
dbApar[i] = new DatabaseAPAR (APAR, lokasi);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `id` dan `lokasi` adalah contoh atribut.

```bash
String nama;
String npm;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public APAR(String id, String lokasi) {
        this.id = id;
        this.lokasi = lokasi;
}

public DatabaseAPAR(String id, String lokasi) {
        super(id, lokasi);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
public void setId(String id) {
        this.id = id;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNpm`, `getTahunMasuk`, `getFakultas`, `getProdi`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String id;
private String lokasi;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class DatabaseAPAR extends APAR {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `APAR` merupakan overloading method `displayInfo` dan `displayInfo` di `DatabaseAPAR` merupakan override dari method `displayInfo` di `APAR`.

```bash
public String displayInfo(String status){
       return displayInfo() + "\nStatus: "+status;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getNoGedung` dan seleksi `getNamaGedung` dalam method `getArea`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < dbApar.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner (System.in);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `DatabaseAPAR[] dbApar = new DatabaseAPAR[2];` adalah contoh penggunaan array.

```bash
DatabaseAPAR[] dbApar = new DatabaseAPAR[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
catch (NumberFormatException e){
            System.out.println("ID Kurang: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
                  System.out.println("APAR Tidak Ada!: "+e.getMessage());
        } 
        catch(Exception e) {
            System.out.println("Kesalahan Kode: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Achmad Randy Al Mugni Fauzi
NPM: 2110010285
