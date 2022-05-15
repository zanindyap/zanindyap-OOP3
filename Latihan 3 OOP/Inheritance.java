package Inheritance 
public class Keluarga {

    public static void main(String[] args) {
       
        Ayah k1 = new Ayah();
        Ibu k2  = new Ibu ();
        Anak k3 = new Anak ();
        
        k1.alamat();
        k2.alamat();
        k3.alamat();
    }
}

public class Ayah extends Keluarga {
    
public void alamat() {
System.out.println("jalan tanah baru no 47 depok");
    }
}

public class Ibu extends Keluarga {

public void alamat() {
System.out.println("jalan tanah baru no 47 depok");
    }
}

public class Anak extends Keluarga{

    public void alamat() {
System.out.println("jalan tanah baru no 47 depok");
    }
}
