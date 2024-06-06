class Penjualan {

static class Data { 
    int harga = 950;
    int jumlah = 115;
    String namaBarang = "Roti Kumis";
};

public static void main(String[] args){
    Data myObj = new Data();
    System.out.println( "nama barang : " + myObj.namaBarang);
    System.out.println( "harga barang : " + myObj.harga);
    System.out.println( "Jumlah yang dibeli : " + myObj.jumlah);
    System.out.println( "__________________________________");
    System.out.println("Total harga : " +  myObj.harga * myObj.jumlah);
    }

}