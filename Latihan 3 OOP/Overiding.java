
package overiding;

public class Keluarga {

    public static void main(String[] args) {
        Ayah ayah = new Ayah();
        Ibu ibu = new Ibu();
        Anak anak = new Anak();
        
        ayah.nama();
        ibu.nama();
        anak.nama();
    }
}

public class Ayah extends Keluarga {

    void nama(){
    System.out.println("nama ayah adalah Raffi");
  }         
}

public class Ibu extends Keluarga {
    
    void nama(){
    System.out.println("nama ibu adalah Nagita");
  }         
}

public class Anak extends Keluarga {

    void nama(){
    System.out.println("nama anak adalah Rafathar");
  }         
}
