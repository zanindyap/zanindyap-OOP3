
package polymorphism;

public class Polymorphism {
    
    public static void main(String[] args) {
        Ayah[] = new Ayah();
        Ibu [0]  = new Ibu();
        Anak [1] = new Anak();
        
        for(int i=0; i<2; ++i){
            Ayah[].random();
    }
}

public class Ayah extends Keluarga {
    
public void random() {
System.out.println("Ayah sayang Ibu");

}

public class Ibu extends Keluarga {

public void random() {
System.out.println("Ibu sayang Anak");
    }
}

public class Anak extends Keluarga{

    public void random() {
System.out.println("Anak sayang Nenek");
    }
}
}
}
