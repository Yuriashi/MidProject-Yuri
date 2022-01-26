package Mid;

import java.io.InputStream;
import java.util.Scanner;
import java.util.Vector;

public class Car extends Kendaraan {

	public Car (InputStream in) {
		super(in);
		
	}

	Scanner scan = new Scanner(System.in);
	Vector<String>jenisList;
	Vector<Integer>entList; 
	
	protected String jenis;
	protected int ent;
	
	
	public void mobil(){
		jenisList = new Vector<>();
		entList = new Vector<>();
		
		do {
			System.out.println("Input type [SUV | Supercar | Minivan] : ");
			jenis = scan.nextLine();
		}while (!jenis.equals("SUV") && !jenis.equals("Supercar") && !jenis.equals("Minivan"));
		
		do {
			System.out.println("Input entertaiment system amount [>= 1] : ");
			ent = scan.nextInt();
			scan.nextLine();
		}while (ent < 1);
		System.out.print("Enter to return");
		scan.nextLine();
		
		 jenisList.add(jenis);
		 entList.add(ent);
	}


	

	}

