package Mid;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	static void Input() {
		Kendaraan kendaraan1 = new Kendaraan(System.in);
		kendaraan1.Kendaraan();
		if(kendaraan1.type.equals("Car") ){
			Car kendaraanCar = new Car(System.in);
			kendaraanCar.mobil();
		}
		if(kendaraan1.type.equals("Motorcycle") ){
			Motor kendaraanMotor = new Motor(System.in);
			kendaraanMotor.motor();
		}
		
		
	}
	static void View() {
		Kendaraan kendaraan = new Kendaraan(System.in);
		kendaraan.View();
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int choose = -1;
		
		do {
			System.out.println("================");
				System.out.println("MENU");
				System.out.println("================");
				System.out.println("1. Input");
				System.out.println("2. View");
				System.out.println("3. Exit");
				System.out.print(">> ");
				
				choose = scan.nextInt();
				scan.nextLine();
				
				switch (choose) {
					case 1 :
					Input();
					break;
					case 2 :
					View();
					break;
				}
			}while(choose != 3 );
			
			}
}