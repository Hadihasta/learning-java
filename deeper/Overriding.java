abstract class Hewan{ 
    protected abstract void suara();
}

class Kucing extends Hewan {
    @Override

    protected void suara(){
        System.out.println("Suara Kucing:................");
    }
}


class Burung extends Hewan { 
    @Override

    protected void suara(){
         System.out.println("Suara Burung:................");
    }
}


public class Overriding {
    public static void main(String[] args){
        Hewan kucing = new Kucing();
        kucing.suara();


        Hewan burung = new Burung();
        burung.suara();
    } 
}