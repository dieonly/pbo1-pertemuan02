import java.util.Scanner;
import java.util.Locale;

public class InputOutput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		//Variable
		String nama;
		String npm;
		String mhs_sem;
		String no_telp;
		double ipk;
		int sks;

		//Input
		System.out.println("FORM BIODATA DIRI UNISKA");
		System.out.println("========================");
		System.out.print("Masukkan NPM anda  : ");
		npm = input.nextLine();
		System.out.print("Masukkan nama anda : ");
		nama = input.nextLine();
		System.out.print("Mahasiswa Semester : ");
		mhs_sem = input.nextLine();
		System.out.print("Masukkan No. Telp  : ");
		no_telp = input.nextLine();
		System.out.print("Masukkan Jumlah SKS yang sudah ditempuh : ");
		sks = input.nextInt();
		System.out.print("Masukkan IPK Sementara : ");
		ipk = input.nextDouble();
		
		//Rumus
		double tot_nil = ipk * sks;

		//Output
		System.out.println("  BIODATA DIRI UNISKA");
		System.out.println("========================");
		System.out.println("NPM          : "+npm);
		System.out.println("Nama         : "+nama);
		System.out.println("Mahasiwa Sem : "+mhs_sem);
		System.out.println("No Telp      : "+no_telp);
		System.out.print("Total Nilai  : "+tot_nil);

	}
}