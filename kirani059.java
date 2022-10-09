import java.util.Scanner;
//vitri septia kirani 2100018059 kelas A
public class kirani059 {
    public static void main(String[] args) {
            int pilih; //tipe data untuk memilih pilihan program untuk memproses
            Scanner inputan = new Scanner(System.in);
            System.out.println("Ini adalah program java");
            System.out.println("===========================");
            System.out.println("1. Perulangan FOR");
            System.out.println("2. Perulangan WHILE");
            System.out.println("3. Perulangan DO-WHILE");
            System.out.println("4. Array 1 DIMENSI");
            System.out.println("5. Array Multidimensi");// println untuk memberi enter sedangkan PRINT ditidak ada enter
            System.out.println("===========================");
            System.out.print("Masukkan pilihan anda = "); pilih = inputan.nextInt();//berfungsi untuk memasukan atau input program
            System.out.println("-----------------------------");
            switch (pilih) {
                case 1: { // pilihan 1 adalah proses menggunakan perulangan for
                    int n;
                    System.out.println("==============================");
                    System.out.println("ANDA MEMILIH PERULANGAN FOR");
                    System.out.println("==============================");
                    System.out.print("masukkan banyaknya perulangan = "); n = inputan.nextInt();//untuk memasukan brp bnyak perulangan
                    System.out.println("-------------------------------");
                    for(int i=1; i<=n; i++){//perulangan dimulai dengan nilai 1 dan berhenti sesuai dengan yang di inputkan
                        System.out.println(i+ " "); //+i adalah untuk memanggil hasil dari variabel i
                    }
                    break;
                }
                case 2: { //pilihan 2 merupakan proses menggunakan cara while
                    int n;
                    System.out.println("==============================");
                    System.out.println("ANDA MEMILIH PERULANGAN WHILE");
                    System.out.println("==============================");
                    System.out.print("masukkan banyaknya perulangan = "); n = inputan.nextInt();//untuk memasukan brp bnyak perulangan
                    System.out.println("-------------------------------");
                    int i=1;
                    while(i<=n){
                        System.out.println(i);
                        i++;
                    }
                    break;
                }
                case 3: {// pilihan 3 adalah proses menggunakan cara perulangan do-while
                    int n;
                    System.out.println("==============================");
                    System.out.println("ANDA MEMILIH PERULANGAN DO-WHILE");
                    System.out.println("==============================");
                    System.out.print("masukkan banyaknya perulangan = "); n = inputan.nextInt();//untuk memasukan brp bnyak perulangan
                    System.out.println("-------------------------------");
                    int i=11;
                    do{
                        System.out.println(i);
                        i++;
                    }while(i<=n);
                    System.out.println("Nilai terakhir i = " +i);
                    break;
                } //vitri septia kirani 2100018059
                case 4: {//cara ke 4 merupakan cara menghitung array dengan 1 dimensi
                    System.out.println("==============================");
                    System.out.println("ANDA MEMILIH ARRAY 1 DIMENSI");
                    System.out.println("==============================");
                    int [] i= new int[5];
                    i[0]=1; i[1]=2; i[2]=3; i[3]=4; i[4]=5; // merupakan isi dari array 1 dimensi
                    System.out.print(i[0]+ " "); // kemudian dioutputkan di sini dari array 0-4
                    System.out.print(i[1]+ " ");
                    System.out.print(i[2]+ " ");
                    System.out.print(i[3]+ " ");
                    System.out.print(i[4]+ " ");
                    break;
                }
                case 5: {// merupakan proses menggunakan array 2 dimensi
                    System.out.println("==============================");
                    System.out.println("ANDA MEMILIH ARRAY MULTIDIMENSI");
                    System.out.println("==============================");
                    int [][] i={{1,2},{3,4}}; //isi dari array 2 dimensi
                    System.out.print(i[0][0]+ " ");//output dri array 2 dimensi
                    System.out.println(i[0][1]+ " ");
                    System.out.print(i[1][0]+ " ");
                    System.out.print(i[1][1]);
                    break;
                }
            }
    }
}