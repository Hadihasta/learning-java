class Laptop {
    String hidupkanLaptop(String pemilik, String merk){
        return "hidupkan Laptop" + merk + " milik " + pemilik; 
    }

    String matikanLaptop(String pemilik, String merk) { 
        return " matikan laptop "+ merk+ "milik" + pemilik;
    }


    void restartLaptop(){
        System.out.println(matikanLaptop("Lando","MSI"));
        System.out.println(hidupkanLaptop("Lando","MSI"));
    }
};


class BelajarJava {
    public static void main (String args[]){
        Laptop laptopAnto = new Laptop();
        laptopAnto.restartLaptop();
    }
}

