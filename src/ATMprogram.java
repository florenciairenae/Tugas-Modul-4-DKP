import java.util.Scanner;

public class ATMprogram {
    /**
     * Kelompok 29
     * Shift 2
     */
    public static class AtmProgram {
        Scanner s = new Scanner(System.in);
        ATMclass atm = new ATMclass();
        double minSaldo = 50000;
        int pil;
        public static void main(String[] args) {
            AtmProgram program = new AtmProgram();
            program.initSaldo(5000000);
            program.login();
        }
        public void initSaldo(double saldo) {
            atm.setSaldo(saldo);
        }
        public void menu() {
            System.out.println("=======================================================");
            System.out.print("");
            System.out.println("=============Selamat Datang di e-Wallet 29==============");
            System.out.println();
            System.out.println("====================================================");
            System.out.print("|");
            System.out.print("\t       > Pilih Transaksi <                    |");
            System.out.println();
            System.out.print("|");
            System.out.print("\t[1] Cek Saldo                                 |");
            System.out.println();
            System.out.print("|");
            System.out.print("\t[2] Penarikan                                 |");
            System.out.println();
            System.out.print("|");
            System.out.print("\t[3] Exit                                 |");
            System.out.println();
            System.out.print("|");
            System.out.println("====================================================");
            System.out.print("\t         Masukan pilihan Anda : ");
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    lihatSaldo();
                    break;
                case 2:
                    tarik();
                    break;
                case 3:
                    System.out.println("=======================================================");
                    System.out.println("\tTerimakasih telah menggunakan layanan kami.");
                    System.out.println("\t      Silahkan Ambil kartu Anda.");
                    break;
                default:
                    System.out.println("Pilihan Yang Anda masukan salah. Silahkan Login kembali.");
                    login();
                    break;
            }
        }
        //-------------------------------- User Login
        public void login() {
            int pin;
            System.out.println("=======================================================");
            System.out.print("|");
            System.out.print("\tSelamat Datang di e-Wallet 29                         |");
            System.out.println();
            System.out.println("=======================================================");
            System.out.print("\t     Masukan PIN : ");
            pin = s.nextInt();
            menu();
        }
        //----------------------------- Menu Lihat Saldo
        public void lihatSaldo() {
            System.out.println("=======================================================");
            System.out.println("\t         Lihat Saldo ");
            System.out.println("=======================================================");
            System.out.println("Sisa Saldo yang Anda miliki adalah sebesar Rp." + atm.getSaldo());
            transaksiLagi();
        }



    }

}
