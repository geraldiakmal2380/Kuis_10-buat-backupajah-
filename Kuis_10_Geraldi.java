import java.util.Scanner;
public class Kuis_10_Geraldi{
    public static void main(String[] args) {
        //inisiaslisasi dan deklarasi
        int[][] parkiran10 = new int[5][3];
        int[] jumlahkendaraan10 = new int[5];
        String[] namakendaraan10 = new String[5];
        Scanner mlebu10 = new Scanner(System.in);

        int totalkendaraanparkir10=0;//variabel total seluruh kendaraan
        int totalmotor10=0;//variabel total motor
        int totalmobil10=0;//variabel total mobil
        int totalsepeda10=0;//variabel total sepeda
        int totaltruk10=0;//variabel total truk
        int totalbus10=0;//variabel total sepeda

        int jumlah_kendaraan_parkir_vip10=0;
        int jumlah_kendaraan_parkir_basement10=0;
        int jumlah_kendaraan_parkir_outdoor10=0;

        int nilaiterendah10=100;//utk konfigurasi mencari nilai tertinggi
        int nilaitertinggi10=0;//utk konfigurasi mencari nilai terendah
        String jeniskendaraanterendah10=null;//inisialiasi dan deklarasi variabel String 
        String jeniskendaraantertinggi10=null;//inisialiasi dan deklarasi variabel String 

        double keuntungan_dari_roda_empat10=0;
        double keuntungan_dari_roda_dua10=0;
        double keuntungan_dari_parkir_vip10=0;
        double keuntungan_dari_parkir_basement10=0;

        //di bawah sini mulai array 2 dimensinya
        //mobil
        parkiran10[0][0]=8;// 0 utk outdoor
        parkiran10[0][1]=15;// 1 itu basement
        parkiran10[0][2]=5;// 2 itu vip
        //motor
        parkiran10[1][0]=15;// 0 utk outdoor
        parkiran10[1][1]=20;// 1 itu basement
        parkiran10[1][2]=2;// 2 itu vip
        //sepeda
        parkiran10[2][0]=5;// 0 utk outdoor
        parkiran10[2][1]=10;// 1 itu basement
        parkiran10[2][2]=1;// 2 itu vip
        //truk
        parkiran10[3][0]=3;// 0 utk outdoor
        parkiran10[3][1]=5;// 1 itu basement
        parkiran10[3][2]=1;// 2 itu vip
        //buss
        parkiran10[4][0]=1;// 0 utk outdoor
        parkiran10[4][1]=2;// 1 itu basement
        parkiran10[4][2]=1;// 2 itu vip
    

    //pengecekan banyaknya jenis kendaraan yang parkir di setiap area

    //total semua kendaraan parkir
    for (int i=0 ;i<5;i++){
        for (int j =0;j<3;j++){
            totalkendaraanparkir10 += parkiran10[i][j];
        }
    }
    System.out.println("Total seluruh kendaraan adalah : "+totalkendaraanparkir10);
    

    //total seluruh kendaraan mobil di semua area
    for (int i=0;i<3;i++){
        totalmobil10 += parkiran10[0][i];
    }
    System.out.println("Total seluruh kendaraan mobil adalah : "+totalmobil10);
    jumlahkendaraan10[0] = totalmobil10;
    namakendaraan10[0] = "mobil";

    //total kendaraan motor parkir di semua area
    for (int i=0;i<3;i++){
        totalmotor10 += parkiran10[1][i];
    }
    System.out.println("Total seluruh kendaraan motor adalah : "+totalmotor10);
    jumlahkendaraan10[1] = totalmotor10;
    namakendaraan10[1] = "motor";

    //total kendaraan sepeda parkir di semua area
    for (int i=0;i<3;i++){
        totalsepeda10 += parkiran10[2][i];
    }
    System.out.println("Total seluruh kendaraan sepeda adalah : "+totalsepeda10);
    jumlahkendaraan10[2] = totalsepeda10;
    namakendaraan10[2] = "sepeda";
    
    //total kendaraan truk parkir di semua area
    for (int i=0;i<3;i++){
        totaltruk10 += parkiran10[3][i];
    }
    System.out.println("Total seluruh kendaraan truk adalah : "+totaltruk10);
    jumlahkendaraan10[3] = totaltruk10;
    namakendaraan10[3] = "truk";

    //total kendaraan bus parkir di semua area
    for (int i=0;i<3;i++){
        totalbus10 += parkiran10[4][i];
    }
    System.out.println("Total seluruh kendaraan bus adalah : "+totalbus10);
    jumlahkendaraan10[4] = totalbus10;
    namakendaraan10[4] = "bus";
    System.out.println("=================================================");

    //rata rata kendaraan tertentu sesuai nomor absen
    //karena saya absen 10 maka 10%3 =1 outdoor

    //rata rata kendaraan outdoor
    for (int i=0;i<5;i++){
        jumlah_kendaraan_parkir_outdoor10+=parkiran10[i][0];
    }
    System.out.println("Rata-rata dari parkiran outdoor adalah : "+jumlah_kendaraan_parkir_outdoor10/5);
    System.out.println("=================================================");

    //jenis kendaraan paling banyak dan paling sedikit
    for (int i=0;i<jumlahkendaraan10.length;i++){
        if (jumlahkendaraan10[i]<nilaiterendah10){
            nilaiterendah10 = jumlahkendaraan10[i];
           jeniskendaraanterendah10 = namakendaraan10[i];
        }
        if(jumlahkendaraan10[i]>nilaitertinggi10){
            nilaitertinggi10 = jumlahkendaraan10[i];
            jeniskendaraantertinggi10 = namakendaraan10[i];
        }
    }
    System.out.println("Jumlah Kendaraan Terbanyak dengan jumlah "+nilaitertinggi10+" dan berjenis "+jeniskendaraantertinggi10);
    System.out.println("Jumlah Kendaraan Terendah dengan jumlah "+nilaiterendah10+" dan berjenis "+jeniskendaraanterendah10);
    System.out.println("=================================================");


    //total pemasukan mall dlm satu hari
    //mencari tahu kendaraan yang parkir di basement dan vip
    for (int i=0;i<5;i++){
        jumlah_kendaraan_parkir_basement10 += parkiran10[i][1];
    }
    System.out.println("Jumlah kendaraan yang parkir di basement adalah : "+jumlah_kendaraan_parkir_basement10);
    for (int i=0;i<5;i++){
        jumlah_kendaraan_parkir_vip10 += parkiran10[i][2];
    }
    System.out.println("Jumlah kendaraan yang parkir di vip adalah : "+jumlah_kendaraan_parkir_vip10);

    //mulai perhitungan matematika
    keuntungan_dari_roda_empat10 = (totalmobil10+totalbus10+totaltruk10)*10000;//kendaraan roda empat dikenakan biaya 10k
    keuntungan_dari_roda_dua10 = (totalmotor10+totalsepeda10)*5000;//kendaraan roda dua dikenakan biaya 5k
    keuntungan_dari_parkir_basement10 = (jumlah_kendaraan_parkir_basement10*3000);//kendaraan yang parkir di basement dikenakan biaya tambahan 3k
    keuntungan_dari_parkir_vip10 = jumlah_kendaraan_parkir_vip10*15000; //kendaraan yang parkir di  vip dikenakan biaya 15k
    System.out.println("Total dari seluruh keuntungan parkir adalah IDR "+(keuntungan_dari_roda_empat10+keuntungan_dari_roda_dua10+keuntungan_dari_parkir_basement10+keuntungan_dari_parkir_vip10));
    mlebu10.close();
}
}