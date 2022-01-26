package Mid;

import java.io.InputStream;
import java.util.Scanner;
import java.util.Vector;

public class Kendaraan {
	Scanner scan = new Scanner(System.in);
	Vector<String> typeList;
	// Vector<String> typeList = new Vector<String>();
	Vector<String>brandList;
	Vector<String>nameList;
	Vector<String>licenseList;
	Vector<Integer>topList;
	Vector<Integer>gasList;
	Vector<Integer>wheelList;
	
	
	protected String type;
	protected String brand;
	protected String name;
	protected String licensenumber;
	protected int topspeed;
	protected int gascap;
	protected int wheel;
	
	public Kendaraan(String type, String brand, String name, String licensenumber, int topspeed, int gascap, int wheel) {
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.licensenumber = licensenumber;
		this.topspeed=topspeed;
		this.gascap=gascap;
		this.wheel=wheel;		
	}
	
	// public void display(){
	// 	System.out.println(this.brand + " dengan nama " + name);
	// }

	public Kendaraan(InputStream in) {
	}

	public void Kendaraan(){
		typeList = new Vector<>();
		brandList = new Vector<>();
		nameList = new Vector<>();
		licenseList = new Vector<>();
		topList = new Vector<>();
		gasList = new Vector<>();
		wheelList = new Vector<>();
		
		do {
			System.out.println("Input type [Car | Motorcycle] : ");
			type = scan.nextLine();
		}while(!type.equals("Car") && !type.equals("Motorcycle"));
		typeList.add(type);
		
		do {
			System.out.println("Input brand [>= 5] : ");
			brand = scan.nextLine();
		}while(brand.length() < 5);
		
		do {
			System.out.println("Input name [>= 5] : ");
			name = scan.nextLine();
		}while(name.length() < 5);
		
		do {
			System.out.println("Input license : ");
			licensenumber = scan.nextLine();
		}while (!licensenumber.startsWith("A-Z") && licensenumber.length() < 1 && licensenumber.length() > 4 && !licensenumber.endsWith("A-Z") && !licensenumber.endsWith("A-Z") && !licensenumber.endsWith("A-Z"));
		
		do {
			System.out.println("Input top speed [100 <= topSpeed <= 250] : ");
			topspeed = scan.nextInt();
			scan.nextLine();
		}while (topspeed <= 100 || topspeed >= 250);
		
		do {
			System.out.println("Input gas capacity [30 <= gasCap <= 60] : ");
			gascap = scan.nextInt();
			scan.nextLine();
		}while (gascap <= 30  || gascap >= 60);
		
		do {
			if (type.equals("Car")){
				System.out.println("Input wheel [4 <= wheel <= 6");
				wheel = scan.nextInt();
				scan.nextLine();
				// Car.Mobil(this.je>?)
			} else {
				System.out.println("Input wheel [2 <= wheel <= 3");
				wheel = scan.nextInt();
				scan.nextLine();
			}	
		}while (!type.equals("Car") && !type.equals("Motorcycle"));
		
		
		typeList.add(type);
		brandList.add(brand);
		nameList.add(name);
		licenseList.add(licensenumber);
		topList.add(topspeed);
		gasList.add(gascap);
		wheelList.add(wheel);
	}
		
	public void View() {
			if (typeList.isEmpty()) {
				System.out.println("|-----|----------|--------------------|");
				System.out.println("| No  | Type     | Name               |");
				System.out.println("|-----|----------|--------------------|");
				for (int i=0; i<typeList.size(); i++) {
					System.out.println("No. " + (i+1));
					System.out.println("Type : " + typeList.get(i));
					System.out.println("Name : " + nameList.get(i));
		
			}	
	
		}
	
	}

		
			
			
		}


