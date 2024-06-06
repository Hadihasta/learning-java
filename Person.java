//declaration package = biasa digunakan untuk aplikasi besar contoh package com.btpnsyariah.program // mengikuti nama domain
//contoh import // import java.util.Scanner


// class ContohProgram {
//     public static void main(String args[]) {
//         system.out.println("hello world");
//     }
// }

// public class Kendaraan{ 


//     public Kendaraan(String nama) {
//         System.out.println("nama kendaraannya adalah" + nama);
//     }

//     public static void main(String[] args){
//         Kendaraan jenis = new Kendaraan ("Pesawat Terbang");
//     }
// }

// // Constructor


public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Sebuah Objek tanpa parameter");
    }

    public Person(String name,int age) { 
        this.name = name;
        this.age = age;
        System.out.println("Objek dengan parameter");
    }


public void displayInfo() { 
    System.out.println("name" + name);
    System.out.println("age" + age);
}

    public static void main(String[] args){
        Person person1 = new Person();
        Person person2 = new Person("ALICE", 30);


        person1.displayInfo();
        person2.displayInfo();

    }
}